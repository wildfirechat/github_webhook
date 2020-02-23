package cn.wildfirechat.app;


import cn.wildfirechat.pojos.SendMessageData;

public interface Service {
    RestResult onReceivePayload(String event, String payload);
}
