package cn.wildfirechat.app;

import cn.wildfirechat.pojos.SendMessageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private Service mService;

    @PostMapping(value = "/github/payload", produces = "application/json;charset=UTF-8"   )
    public Object onReceivePayload(@RequestHeader("X-GitHub-Event") String event, @RequestBody String payload) {
        return mService.onReceivePayload(event, payload);
    }

}
