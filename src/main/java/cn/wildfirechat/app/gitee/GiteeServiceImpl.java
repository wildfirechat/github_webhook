package cn.wildfirechat.app.gitee;

import cn.wildfirechat.app.GiteeService;
import cn.wildfirechat.app.RestResult;
import cn.wildfirechat.app.gitee.pojo.Commit;
import cn.wildfirechat.app.gitee.pojo.IssueEvent;
import cn.wildfirechat.app.gitee.pojo.NoteEvent;
import cn.wildfirechat.app.gitee.pojo.PushEvent;
import cn.wildfirechat.common.ErrorCode;
import cn.wildfirechat.pojos.Conversation;
import cn.wildfirechat.pojos.MessagePayload;
import cn.wildfirechat.pojos.SendMessageResult;
import cn.wildfirechat.sdk.ChatConfig;
import cn.wildfirechat.sdk.RobotService;
import cn.wildfirechat.sdk.model.IMResult;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

@org.springframework.stereotype.Service
public class GiteeServiceImpl implements GiteeService {
    private static final Logger LOG = LoggerFactory.getLogger(GiteeServiceImpl.class);

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

    @Override
    public RestResult onReceivePayload(String event, String payload) {
        LOG.info("on receive github message {}", payload);
        String message = null;

        try {
            if(event.equals("Push Hook")) {
                PushEvent pushEvent = new Gson().fromJson(payload, PushEvent.class);
                message = "用户 " + pushEvent.pusher.name + " 在仓库 " + pushEvent.repository.full_name + " 提交了代码\n";
                for (Commit commit : pushEvent.commits) {
                    message += "提交描述: " + commit.message + " 修改代码: " + commit.url + " \n";
                }
            } else if(event.equals("Issue Hook")) {
                IssueEvent issueEvent = new Gson().fromJson(payload, IssueEvent.class);
                message = "用户 " + issueEvent.sender.name + " 在仓库 " + issueEvent.repository.full_name + " " + issueEvent.action + " issue\n";
                message += issueEvent.issue.html_url + " \n";
                message += issueEvent.issue.title + " : " + issueEvent.issue.body;
            } else if(event.equals("Note Hook")) {
                NoteEvent noteEvent = new Gson().fromJson(payload, NoteEvent.class);
                message = "用户 " + noteEvent.sender.name + " " + noteEvent.action + " " + noteEvent.repository.full_name + " : " + noteEvent.issue.title +  " \n";
                message += "内容: " + noteEvent.comment.body + " \n";
                message += "issue链接: " + noteEvent.issue.html_url;
            } else {
                message = "未知内容！\n" + payload;
            }
        } catch (Exception e) {
            message = "糟糕，出错了！\n" + payload;
        }
        sendMessage(message);
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
