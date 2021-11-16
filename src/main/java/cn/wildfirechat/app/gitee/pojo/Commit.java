package cn.wildfirechat.app.gitee.pojo;

public class Commit {
//    {
//        "id": "3a6902040b2fd1e240315a84611d36eef14b4f2f",
    public String id;
//            "tree_id": "ad2f7b1729eea675cd44da48f5e53abdf8f242a8",
    public String tree_id;
//            "parent_ids": [
//        "ad2f7b1729eea675cd44da48f5e53abdf8f242a8"
//      ],
    public String[] parent_ids;
//        "distinct": true,
    public boolean distinct;
//            "message": "这是一条测试 Push 类型 WebHook 触发的推送",
    public String message;
//            "timestamp": "2020-04-15T21:09:40+08:00",
    public String timestamp;
//            "url": "https://gitee.com/oschina/gitee/commit/3a6902040b2fd1e240315a84611d36eef14b4f2f",
    public String url;
//            "author": {
//        "time": "2020-04-15T21:09:40+08:00",
//                "id": 1,
//                "name": "Gitee",
//                "email": "gitee@gitee.com",
//                "username": "oschina-org",
//                "user_name": "oschina-org",
//                "url": "https://gitee.com/oschina-org"
//    },
    public User author;
//        "committer": {
//        "id": 1,
//                "name": "Gitee",
//                "email": "gitee@gitee.com",
//                "username": "oschina-org",
//                "user_name": "oschina-org",
//                "url": "https://gitee.com/oschina-org"
//    },
    public User committer;
//        "added": null,
    public String[] added;
//            "removed": null,
    public String[] removed;
//            "modified": [
//        "README.md"
//      ]
    public String[] modified;
//    }
}
