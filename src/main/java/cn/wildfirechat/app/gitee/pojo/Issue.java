package cn.wildfirechat.app.gitee.pojo;

public class Issue {
//    "html_url": "https://gitee.com/oschina/git-osc/issues/I1EL99",
    public String html_url;
//            "id": 295024870,
    public long id;
//            "number": "I1EL99",
    public String number;
//            "title": "这是一条测试 WebHook 接收功能触发的推送",
    public String title;
//            "user": {
//        "login": "oschina-org",
//                "avatar_url": "https://gitee.com/assets/favicon.ico",
//                "html_url": "https://gitee.com/oschina-org",
//                "type": "User",
//                "site_admin": false,
//                "id": 1,
//                "name": "Gitee",
//                "email": "gitee@gitee.com",
//                "username": "oschina-org",
//                "user_name": "oschina-org",
//                "url": "https://gitee.com/oschina-org"
//    },
    public User user;
//            "labels": [
//    {
//        "id": 827033694,
//            "name": "bug",
//            "color": "d73a4a"
//    }
//    ],
    public Label[] labels;
//            "state": "open",
    public String state;
//            "state_name": "待办的",
    public String state_name;
//            "type_name": "任务",
    public String type_name;
//            "assignee": {
//        "login": "oschina-org",
//                "avatar_url": "https://gitee.com/assets/favicon.ico",
//                "html_url": "https://gitee.com/oschina-org",
//                "type": "User",
//                "site_admin": false,
//                "id": 1,
//                "name": "Gitee",
//                "email": "gitee@gitee.com",
//                "username": "oschina-org",
//                "user_name": "oschina-org",
//                "url": "https://gitee.com/oschina-org"
//    },
    public User assignee;
//            "collaborators": [
//    {
//        "login": "oschina-org",
//            "avatar_url": "https://gitee.com/assets/favicon.ico",
//            "html_url": "https://gitee.com/oschina-org",
//            "type": "User",
//            "site_admin": false,
//            "id": 1,
//            "name": "Gitee",
//            "email": "gitee@gitee.com",
//            "username": "oschina-org",
//            "user_name": "oschina-org",
//            "url": "https://gitee.com/oschina-org"
//    }
//    ],
    public User[] collaborators;
//            "milestone": {
//        "html_url": "https://gitee.com/oschina/gitee/milestones/14143",
//                "id": 1,
//                "number": 1,
//                "title": "问题反馈",
//                "description": null,
//                "open_issues": 13,
//                "closed_issues": 31,
//                "state": "open",
//                "created_at": "2020-04-15T21:09:40+08:00",
//                "updated_at": "2020-04-15T21:09:40+08:00",
//                "due_on": null
//    },
    public Milestone milestone;
//            "comments": 0,
    public int comments;
//            "created_at": "2020-04-15T21:09:40+08:00",
    public String created_at;
//            "updated_at": "2020-04-15T21:09:40+08:00",
    public String updated_at;
//            "body": "这是一条测试 WebHook 接收功能触发的推送"
    public String body;
}
