package cn.wildfirechat.app;


import cn.wildfirechat.pojos.SendMessageData;

public interface GithubService {
    RestResult onReceivePayload(String event, String payload);
}
