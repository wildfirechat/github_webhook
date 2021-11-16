package cn.wildfirechat.app;


public interface GiteeService {
    RestResult onReceivePayload(String event, String payload);
}
