package cn.wildfirechat.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private GithubService mGithubService;

    @Autowired
    private GiteeService mGiteeService;

    @PostMapping(value = "/github/payload", produces = "application/json;charset=UTF-8"   )
    public Object onReceiveGithubPayload(@RequestHeader("X-GitHub-Event") String event, @RequestBody String payload) {
        return mGithubService.onReceivePayload(event, payload);
    }

    @PostMapping(value = "/gitee/payload", produces = "application/json;charset=UTF-8"   )
    public Object onReceiveGiteePayload(@RequestHeader("X-Gitee-Event") String event, @RequestBody String payload) {
        return mGiteeService.onReceivePayload(event, payload);
    }
}
