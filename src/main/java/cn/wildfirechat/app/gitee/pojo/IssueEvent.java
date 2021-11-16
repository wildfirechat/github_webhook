package cn.wildfirechat.app.gitee.pojo;

import com.google.gson.Gson;

import javax.swing.text.html.parser.Entity;

public class IssueEvent {
    //    {
//        "action": "open",
    public String action;
    public Issue issue;
    public Repository repository;
    public User sender;
    public User target_user;
    public User user;
    public User assignee;
    public User updated_by;
    //        "iid": "I1EL99",
    public String iid;
    //            "title": "这是一条测试 WebHook 接收功能触发的推送",
    public String title;
    //            "description": "这是一条测试 WebHook 接收功能触发的推送",
    public String description;
    //            "state": "open",
    public String state;
    //            "milestone": "问题反馈",
    public String milestone;
    //            "url": "https://gitee.com/oschina/git-osc/issues/I1EL99",
    public String url;
    //            "enterprise": {
//        "name": "OSCHINA",
//                "url": "https://gitee.com/oschina"
//    },
    public Enterprise enterprise;
    //        "hook_name": "issue_hooks",
    public String hook_name;
    //            "hook_id": 822463,
    public long hook_id;
    //            "hook_url": "https://gitee.com/wfchat/im-server/hooks/822463/edit",
    public String hook_url;
    //            "password": "",
    public String password;
    //            "timestamp": null,
    public String timestamp;
    //            "sign": ""
    public String sign;

    //    }
    public static void main(String[] args) {
        String event1 = "{\n" +
                "  \"action\": \"open\",\n" +
                "  \"issue\": {\n" +
                "    \"html_url\": \"https://gitee.com/oschina/git-osc/issues/I1EL99\",\n" +
                "    \"id\": 295024870,\n" +
                "    \"number\": \"I1EL99\",\n" +
                "    \"title\": \"这是一条测试 WebHook 接收功能触发的推送\",\n" +
                "    \"user\": {\n" +
                "      \"login\": \"oschina-org\",\n" +
                "      \"avatar_url\": \"https://gitee.com/assets/favicon.ico\",\n" +
                "      \"html_url\": \"https://gitee.com/oschina-org\",\n" +
                "      \"type\": \"User\",\n" +
                "      \"site_admin\": false,\n" +
                "      \"id\": 1,\n" +
                "      \"name\": \"Gitee\",\n" +
                "      \"email\": \"gitee@gitee.com\",\n" +
                "      \"username\": \"oschina-org\",\n" +
                "      \"user_name\": \"oschina-org\",\n" +
                "      \"url\": \"https://gitee.com/oschina-org\"\n" +
                "    },\n" +
                "    \"labels\": [\n" +
                "      {\n" +
                "        \"id\": 827033694,\n" +
                "        \"name\": \"bug\",\n" +
                "        \"color\": \"d73a4a\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"state\": \"open\",\n" +
                "    \"state_name\": \"待办的\",\n" +
                "    \"type_name\": \"任务\",\n" +
                "    \"assignee\": {\n" +
                "      \"login\": \"oschina-org\",\n" +
                "      \"avatar_url\": \"https://gitee.com/assets/favicon.ico\",\n" +
                "      \"html_url\": \"https://gitee.com/oschina-org\",\n" +
                "      \"type\": \"User\",\n" +
                "      \"site_admin\": false,\n" +
                "      \"id\": 1,\n" +
                "      \"name\": \"Gitee\",\n" +
                "      \"email\": \"gitee@gitee.com\",\n" +
                "      \"username\": \"oschina-org\",\n" +
                "      \"user_name\": \"oschina-org\",\n" +
                "      \"url\": \"https://gitee.com/oschina-org\"\n" +
                "    },\n" +
                "    \"collaborators\": [\n" +
                "      {\n" +
                "        \"login\": \"oschina-org\",\n" +
                "        \"avatar_url\": \"https://gitee.com/assets/favicon.ico\",\n" +
                "        \"html_url\": \"https://gitee.com/oschina-org\",\n" +
                "        \"type\": \"User\",\n" +
                "        \"site_admin\": false,\n" +
                "        \"id\": 1,\n" +
                "        \"name\": \"Gitee\",\n" +
                "        \"email\": \"gitee@gitee.com\",\n" +
                "        \"username\": \"oschina-org\",\n" +
                "        \"user_name\": \"oschina-org\",\n" +
                "        \"url\": \"https://gitee.com/oschina-org\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"milestone\": {\n" +
                "      \"html_url\": \"https://gitee.com/oschina/gitee/milestones/14143\",\n" +
                "      \"id\": 1,\n" +
                "      \"number\": 1,\n" +
                "      \"title\": \"问题反馈\",\n" +
                "      \"description\": null,\n" +
                "      \"open_issues\": 13,\n" +
                "      \"closed_issues\": 31,\n" +
                "      \"state\": \"open\",\n" +
                "      \"created_at\": \"2020-04-15T21:09:40+08:00\",\n" +
                "      \"updated_at\": \"2020-04-15T21:09:40+08:00\",\n" +
                "      \"due_on\": null\n" +
                "    },\n" +
                "    \"comments\": 0,\n" +
                "    \"created_at\": \"2020-04-15T21:09:40+08:00\",\n" +
                "    \"updated_at\": \"2020-04-15T21:09:40+08:00\",\n" +
                "    \"body\": \"这是一条测试 WebHook 接收功能触发的推送\"\n" +
                "  },\n" +
                "  \"repository\": {\n" +
                "    \"id\": 151,\n" +
                "    \"name\": \"Gitee FeedBack\",\n" +
                "    \"path\": \"git-osc\",\n" +
                "    \"full_name\": \"oschina/git-osc\",\n" +
                "    \"owner\": {\n" +
                "      \"login\": \"oschina-org\",\n" +
                "      \"avatar_url\": \"https://gitee.com/assets/favicon.ico\",\n" +
                "      \"html_url\": \"https://gitee.com/oschina-org\",\n" +
                "      \"type\": \"User\",\n" +
                "      \"site_admin\": false,\n" +
                "      \"id\": 1,\n" +
                "      \"name\": \"Gitee\",\n" +
                "      \"email\": \"gitee@gitee.com\",\n" +
                "      \"username\": \"oschina-org\",\n" +
                "      \"user_name\": \"oschina-org\",\n" +
                "      \"url\": \"https://gitee.com/oschina-org\"\n" +
                "    },\n" +
                "    \"private\": false,\n" +
                "    \"html_url\": \"https://gitee.com/oschina/git-osc\",\n" +
                "    \"url\": \"https://gitee.com/oschina/git-osc\",\n" +
                "    \"description\": \"\",\n" +
                "    \"fork\": false,\n" +
                "    \"created_at\": \"2020-04-15T21:09:40+08:00\",\n" +
                "    \"updated_at\": \"2020-04-15T21:09:40+08:00\",\n" +
                "    \"pushed_at\": \"2020-04-15T21:09:40+08:00\",\n" +
                "    \"git_url\": \"git://gitee.com:oschina/git-osc.git\",\n" +
                "    \"ssh_url\": \"git@gitee.com:oschina/git-osc.git\",\n" +
                "    \"clone_url\": \"https://gitee.com/oschina/git-osc.git\",\n" +
                "    \"svn_url\": \"svn://gitee.com/oschina/git-osc\",\n" +
                "    \"git_http_url\": \"https://gitee.com/oschina/git-osc.git\",\n" +
                "    \"git_ssh_url\": \"git@gitee.com:oschina/git-osc.git\",\n" +
                "    \"git_svn_url\": \"svn://gitee.com/oschina/git-osc\",\n" +
                "    \"homepage\": null,\n" +
                "    \"stargazers_count\": 11,\n" +
                "    \"watchers_count\": 12,\n" +
                "    \"forks_count\": 0,\n" +
                "    \"language\": \"ruby\",\n" +
                "    \"has_issues\": true,\n" +
                "    \"has_wiki\": true,\n" +
                "    \"has_pages\": false,\n" +
                "    \"license\": null,\n" +
                "    \"open_issues_count\": 0,\n" +
                "    \"default_branch\": \"master\",\n" +
                "    \"namespace\": \"oschina\",\n" +
                "    \"name_with_namespace\": \"OSCHINA/git-osc\",\n" +
                "    \"path_with_namespace\": \"oschina/git-osc\"\n" +
                "  },\n" +
                "  \"project\": {\n" +
                "    \"id\": 151,\n" +
                "    \"name\": \"Gitee FeedBack\",\n" +
                "    \"path\": \"git-osc\",\n" +
                "    \"full_name\": \"oschina/git-osc\",\n" +
                "    \"owner\": {\n" +
                "      \"login\": \"oschina-org\",\n" +
                "      \"avatar_url\": \"https://gitee.com/assets/favicon.ico\",\n" +
                "      \"html_url\": \"https://gitee.com/oschina-org\",\n" +
                "      \"type\": \"User\",\n" +
                "      \"site_admin\": false,\n" +
                "      \"id\": 1,\n" +
                "      \"name\": \"Gitee\",\n" +
                "      \"email\": \"gitee@gitee.com\",\n" +
                "      \"username\": \"oschina-org\",\n" +
                "      \"user_name\": \"oschina-org\",\n" +
                "      \"url\": \"https://gitee.com/oschina-org\"\n" +
                "    },\n" +
                "    \"private\": false,\n" +
                "    \"html_url\": \"https://gitee.com/oschina/git-osc\",\n" +
                "    \"url\": \"https://gitee.com/oschina/git-osc\",\n" +
                "    \"description\": \"\",\n" +
                "    \"fork\": false,\n" +
                "    \"created_at\": \"2020-04-15T21:09:40+08:00\",\n" +
                "    \"updated_at\": \"2020-04-15T21:09:40+08:00\",\n" +
                "    \"pushed_at\": \"2020-04-15T21:09:40+08:00\",\n" +
                "    \"git_url\": \"git://gitee.com:oschina/git-osc.git\",\n" +
                "    \"ssh_url\": \"git@gitee.com:oschina/git-osc.git\",\n" +
                "    \"clone_url\": \"https://gitee.com/oschina/git-osc.git\",\n" +
                "    \"svn_url\": \"svn://gitee.com/oschina/git-osc\",\n" +
                "    \"git_http_url\": \"https://gitee.com/oschina/git-osc.git\",\n" +
                "    \"git_ssh_url\": \"git@gitee.com:oschina/git-osc.git\",\n" +
                "    \"git_svn_url\": \"svn://gitee.com/oschina/git-osc\",\n" +
                "    \"homepage\": null,\n" +
                "    \"stargazers_count\": 11,\n" +
                "    \"watchers_count\": 12,\n" +
                "    \"forks_count\": 0,\n" +
                "    \"language\": \"ruby\",\n" +
                "    \"has_issues\": true,\n" +
                "    \"has_wiki\": true,\n" +
                "    \"has_pages\": false,\n" +
                "    \"license\": null,\n" +
                "    \"open_issues_count\": 0,\n" +
                "    \"default_branch\": \"master\",\n" +
                "    \"namespace\": \"oschina\",\n" +
                "    \"name_with_namespace\": \"OSCHINA/git-osc\",\n" +
                "    \"path_with_namespace\": \"oschina/git-osc\"\n" +
                "  },\n" +
                "  \"sender\": {\n" +
                "    \"login\": \"oschina-org\",\n" +
                "    \"avatar_url\": \"https://gitee.com/assets/favicon.ico\",\n" +
                "    \"html_url\": \"https://gitee.com/oschina-org\",\n" +
                "    \"type\": \"User\",\n" +
                "    \"site_admin\": false,\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"Gitee\",\n" +
                "    \"email\": \"gitee@gitee.com\",\n" +
                "    \"username\": \"oschina-org\",\n" +
                "    \"user_name\": \"oschina-org\",\n" +
                "    \"url\": \"https://gitee.com/oschina-org\"\n" +
                "  },\n" +
                "  \"target_user\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"Gitee\",\n" +
                "    \"email\": \"gitee@gitee.com\",\n" +
                "    \"username\": \"oschina-org\",\n" +
                "    \"user_name\": \"oschina-org\",\n" +
                "    \"url\": \"https://gitee.com/oschina-org\"\n" +
                "  },\n" +
                "  \"user\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"Gitee\",\n" +
                "    \"email\": \"gitee@gitee.com\",\n" +
                "    \"username\": \"oschina-org\",\n" +
                "    \"user_name\": \"oschina-org\",\n" +
                "    \"url\": \"https://gitee.com/oschina-org\"\n" +
                "  },\n" +
                "  \"assignee\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"Gitee\",\n" +
                "    \"email\": \"gitee@gitee.com\",\n" +
                "    \"username\": \"oschina-org\",\n" +
                "    \"user_name\": \"oschina-org\",\n" +
                "    \"url\": \"https://gitee.com/oschina-org\"\n" +
                "  },\n" +
                "  \"updated_by\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"Gitee\",\n" +
                "    \"email\": \"gitee@gitee.com\",\n" +
                "    \"username\": \"oschina-org\",\n" +
                "    \"user_name\": \"oschina-org\",\n" +
                "    \"url\": \"https://gitee.com/oschina-org\"\n" +
                "  },\n" +
                "  \"iid\": \"I1EL99\",\n" +
                "  \"title\": \"这是一条测试 WebHook 接收功能触发的推送\",\n" +
                "  \"description\": \"这是一条测试 WebHook 接收功能触发的推送\",\n" +
                "  \"state\": \"open\",\n" +
                "  \"milestone\": \"问题反馈\",\n" +
                "  \"url\": \"https://gitee.com/oschina/git-osc/issues/I1EL99\",\n" +
                "  \"enterprise\": {\n" +
                "    \"name\": \"OSCHINA\",\n" +
                "    \"url\": \"https://gitee.com/oschina\"\n" +
                "  },\n" +
                "  \"hook_name\": \"issue_hooks\",\n" +
                "  \"hook_id\": 822463,\n" +
                "  \"hook_url\": \"https://gitee.com/wfchat/im-server/hooks/822463/edit\",\n" +
                "  \"password\": \"\",\n" +
                "  \"timestamp\": null,\n" +
                "  \"sign\": \"\"\n" +
                "}";
        IssueEvent issueEvent = new Gson().fromJson(event1, IssueEvent.class);
        System.out.println(issueEvent.action);
    }
}
