package cn.wildfirechat.app;


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

        if (sendMessage("你收到了一个github事件：" + event)) {
            sendMessage(githubPayload);
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
