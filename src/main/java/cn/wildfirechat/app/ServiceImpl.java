package cn.wildfirechat.app;


import cn.wildfirechat.app.pojo.*;
import cn.wildfirechat.common.ErrorCode;
import cn.wildfirechat.pojos.*;
import cn.wildfirechat.sdk.ChatConfig;
import cn.wildfirechat.sdk.RobotService;
import cn.wildfirechat.sdk.model.*;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import javax.validation.Payload;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    private static final Logger LOG = LoggerFactory.getLogger(ServiceImpl.class);
    private static ConcurrentHashMap<String, Record> mRecords = new ConcurrentHashMap<>();

    @Value("${robot.im_id}")
    private String mRobotId;

    @Value("${robot.im_url}")
    private String mImUrl;

    @Value("${robot.im_secret}")
    private String mRobotSecret;

    @Value("${forward.conversation_type}")
    private int mFwdType;

    @Value("${forward.conversation_target}")
    private String mFwdTarget;

    @PostConstruct
    private void init() {
        ChatConfig.initRobot(mImUrl, mRobotId, mRobotSecret);
    }

//    int ConversationType_Private = 0;
//    int ConversationType_Group = 1;
//    int ConversationType_ChatRoom = 2;
//    int ConversationType_Channel = 3;
//    int ConversationType_Thing = 4;
    @Override
    public RestResult onReceivePayload(String event, String githubPayload) {
        LOG.info("on receive message {}", githubPayload);

        String message = null;

        try {
            if (event.equals("push")) {
                PushEvent pushEvent = PushEvent.fromJson(githubPayload);
                message = "用户 " + pushEvent.pusher.name + " 在仓库 " + pushEvent.repository.full_name + " 提交了代码\n";
                for (Commit commit : pushEvent.commits) {
                    message += "提交描述: " + commit.message + " 修改代码: " + commit.url + " \n";
                }
            } else if(event.equals("issues")) {
                IssueEvent issueEvent = IssueEvent.fromJson(githubPayload);
                message = "用户 " + issueEvent.sender.login + " 在仓库 " + issueEvent.repository.full_name + " " + issueEvent.action + " issue\n";
                message += issueEvent.issue.html_url + " \n";
                message += issueEvent.issue.title + " : " + issueEvent.issue.body;
            } else if(event.equals("star")) {
                StarEvent starEvent = StarEvent.fromJson(githubPayload);
                if (starEvent.action.equals("created")) {
                    message = "用户 " + starEvent.sender.login + " star 了工程 " + starEvent.repository.full_name + " \n";
                } else {
                    message = "用户 " + starEvent.sender.login + " unstar 了工程 " + starEvent.repository.full_name + " \n";
                }
                message += "现有star数: " + starEvent.repository.stargazers_count;
            } else if(event.equals("issue_comment")) {
                IssueCommentEvent issueCommentEvent = IssueCommentEvent.fromJson(githubPayload);
                if (issueCommentEvent.action.equals("created")) {
                    message = "用户 " + issueCommentEvent.sender.login + " 评论了issue " + issueCommentEvent.repository.full_name + " : " + issueCommentEvent.issue.title +  " \n";
                    message += "内容: " + issueCommentEvent.comment.body + " \n";
                } else if (issueCommentEvent.action.equals("edited")) {
                    message = "用户 " + issueCommentEvent.sender.login + " 修改了issue " + issueCommentEvent.repository.full_name + " : " + issueCommentEvent.issue.title +  " 的评论\n";
                    message += "修改内容: " + issueCommentEvent.comment.body + " \n";
                } else {
                    message = "用户 " + issueCommentEvent.sender.login + " 删除了issue " + issueCommentEvent.repository.full_name + " 的评论\n";
                }
                message += "issue链接: " + issueCommentEvent.issue.html_url;
            } else if(event.equals("fork")) {
                ForkEvent forkEvent = ForkEvent.fromJson(githubPayload);
                if (forkEvent.forkee.fork) {
                    message = "用户 " + forkEvent.sender.login + " fork 了工程 " + forkEvent.repository.full_name + " \n";
                } else {
                    message = "用户 " + forkEvent.sender.login + " unfork 了工程 " + forkEvent.repository.full_name + " \n";
                }
                message += "现有star数: " + forkEvent.repository.stargazers_count + "。 现在的fork数: " + forkEvent.repository.forks_count;
            } else if(event.equals("watch")) {
                WatchEvent watchEvent = WatchEvent.fromJson(githubPayload);
                message = "用户 " + watchEvent.sender.login + " watch 了工程 " + watchEvent.repository.full_name + " \n";
            } else if(event.equals("ping")) {
                PingEvent pingEvent = PingEvent.fromJson(githubPayload);
                message = "Ping to " + pingEvent.repository.full_name;
            } else if(event.equals("pull_request")) {
                PullRequestEvent pullRequestEvent = PullRequestEvent.fromJson(githubPayload);
                message = "User " + pullRequestEvent.sender.login + " pull request:" + pullRequestEvent.repository.full_name + "。\nTitle:" + pullRequestEvent.pull_request.title + "\nbody:" + pullRequestEvent.pull_request.body + "\nurl:" + pullRequestEvent.pull_request.html_url;
            }
        } catch (Exception e) {
            e.printStackTrace();
            sendMessage("糟糕，处理github事件出错了：" + e.getMessage());
        }

        if (message == null) {
            if (sendMessage("你收到了一个github事件：" + event)) {
                sendMessage(githubPayload);
            }
        } else {
            sendMessage(message);
        }
        return RestResult.ok();
    }

    private boolean sendMessage(String text) {
        Conversation conversation = new Conversation();
        conversation.setType(mFwdType);
        conversation.setTarget(mFwdTarget);

        MessagePayload payload = new MessagePayload();
        payload.setType(1);
        payload.setSearchableContent(text);

        try {
            IMResult<SendMessageResult> result = RobotService.sendMessage(mRobotId, conversation, payload);
            if (result != null) {
                if (result.getErrorCode() == ErrorCode.ERROR_CODE_SUCCESS) {
                    LOG.info("Send response success");
                    return true;
                } else {
                    LOG.error("Send response error {}", result.getCode());
                }
            } else {
                LOG.error("Send response is null");
            }
        } catch (Exception e) {
            e.printStackTrace();
            LOG.error("Send response execption");
        }
        return false;
    }
}
