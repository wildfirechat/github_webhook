package cn.wildfirechat.app.gitee.pojo;

import com.google.gson.Gson;

public class PushEvent {
    public String ref;
    public String before;
    public String after;
    public boolean created;
    public boolean deleted;
    public String compare;
    public Commit[] commits;
    public Commit head_commit;
    public int total_commits_count;
    public boolean commits_more_than_ten;
    public Repository repository;
    public int user_id;
    public String user_name;
    public User user;
    public User pusher;
    public User sender;
    public Enterprise enterprise;
    public String hook_name;
    public long hook_id;
    public String hook_url;
    public String password;
    public String timestamp;
    public String sign;

    public static void main(String[] args) {
        String event1 = "{\n" +
                "  \"ref\": \"refs/heads/test_version\",\n" +
                "  \"before\": \"3a6902040b2fd1e240315a84611d36eef14b4f2f\",\n" +
                "  \"after\": \"ad2f7b1729eea675cd44da48f5e53abdf8f242a8\",\n" +
                "  \"created\": false,\n" +
                "  \"deleted\": false,\n" +
                "  \"compare\": \"https://gitee.com/oschina/gitee/compare/3a6902040b2fd1e240315a84611d36eef14b4f2f...ad2f7b1729eea675cd44da48f5e53abdf8f242a8\",\n" +
                "  \"commits\": [\n" +
                "    {\n" +
                "      \"id\": \"3a6902040b2fd1e240315a84611d36eef14b4f2f\",\n" +
                "      \"tree_id\": \"ad2f7b1729eea675cd44da48f5e53abdf8f242a8\",\n" +
                "      \"parent_ids\": [\n" +
                "        \"ad2f7b1729eea675cd44da48f5e53abdf8f242a8\"\n" +
                "      ],\n" +
                "      \"distinct\": true,\n" +
                "      \"message\": \"这是一条测试 Push 类型 WebHook 触发的推送\",\n" +
                "      \"timestamp\": \"2020-04-15T21:09:40+08:00\",\n" +
                "      \"url\": \"https://gitee.com/oschina/gitee/commit/3a6902040b2fd1e240315a84611d36eef14b4f2f\",\n" +
                "      \"author\": {\n" +
                "        \"time\": \"2020-04-15T21:09:40+08:00\",\n" +
                "        \"id\": 1,\n" +
                "        \"name\": \"Gitee\",\n" +
                "        \"email\": \"gitee@gitee.com\",\n" +
                "        \"username\": \"oschina-org\",\n" +
                "        \"user_name\": \"oschina-org\",\n" +
                "        \"url\": \"https://gitee.com/oschina-org\"\n" +
                "      },\n" +
                "      \"committer\": {\n" +
                "        \"id\": 1,\n" +
                "        \"name\": \"Gitee\",\n" +
                "        \"email\": \"gitee@gitee.com\",\n" +
                "        \"username\": \"oschina-org\",\n" +
                "        \"user_name\": \"oschina-org\",\n" +
                "        \"url\": \"https://gitee.com/oschina-org\"\n" +
                "      },\n" +
                "      \"added\": null,\n" +
                "      \"removed\": null,\n" +
                "      \"modified\": [\n" +
                "        \"README.md\"\n" +
                "      ]\n" +
                "    }\n" +
                "  ],\n" +
                "  \"head_commit\": {\n" +
                "    \"id\": \"3a6902040b2fd1e240315a84611d36eef14b4f2f\",\n" +
                "    \"tree_id\": \"ad2f7b1729eea675cd44da48f5e53abdf8f242a8\",\n" +
                "    \"parent_ids\": [\n" +
                "      \"ad2f7b1729eea675cd44da48f5e53abdf8f242a8\"\n" +
                "    ],\n" +
                "    \"distinct\": true,\n" +
                "    \"message\": \"这是一条测试 Push 类型 WebHook 触发的推送\",\n" +
                "    \"timestamp\": \"2020-04-15T21:09:40+08:00\",\n" +
                "    \"url\": \"https://gitee.com/oschina/gitee/commit/3a6902040b2fd1e240315a84611d36eef14b4f2f\",\n" +
                "    \"author\": {\n" +
                "      \"time\": \"2020-04-15T21:09:40+08:00\",\n" +
                "      \"id\": 1,\n" +
                "      \"name\": \"Gitee\",\n" +
                "      \"email\": \"gitee@gitee.com\",\n" +
                "      \"username\": \"oschina-org\",\n" +
                "      \"user_name\": \"oschina-org\",\n" +
                "      \"url\": \"https://gitee.com/oschina-org\"\n" +
                "    },\n" +
                "    \"committer\": {\n" +
                "      \"id\": 1,\n" +
                "      \"name\": \"Gitee\",\n" +
                "      \"email\": \"gitee@gitee.com\",\n" +
                "      \"username\": \"oschina-org\",\n" +
                "      \"user_name\": \"oschina-org\",\n" +
                "      \"url\": \"https://gitee.com/oschina-org\"\n" +
                "    },\n" +
                "    \"added\": null,\n" +
                "    \"removed\": null,\n" +
                "    \"modified\": [\n" +
                "      \"README.md\"\n" +
                "    ]\n" +
                "  },\n" +
                "  \"total_commits_count\": 1,\n" +
                "  \"commits_more_than_ten\": false,\n" +
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
                "  \"user_id\": 1,\n" +
                "  \"user_name\": \"Gitee\",\n" +
                "  \"user\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"Gitee\",\n" +
                "    \"email\": \"gitee@gitee.com\",\n" +
                "    \"username\": \"oschina-org\",\n" +
                "    \"user_name\": \"oschina-org\",\n" +
                "    \"url\": \"https://gitee.com/oschina-org\"\n" +
                "  },\n" +
                "  \"pusher\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"Gitee\",\n" +
                "    \"email\": \"gitee@gitee.com\",\n" +
                "    \"username\": \"oschina-org\",\n" +
                "    \"user_name\": \"oschina-org\",\n" +
                "    \"url\": \"https://gitee.com/oschina-org\"\n" +
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
                "  \"enterprise\": {\n" +
                "    \"name\": \"OSCHINA\",\n" +
                "    \"url\": \"https://gitee.com/oschina\"\n" +
                "  },\n" +
                "  \"hook_name\": \"push_hooks\",\n" +
                "  \"hook_id\": 822463,\n" +
                "  \"hook_url\": \"https://gitee.com/wfchat/im-server/hooks/822463/edit\",\n" +
                "  \"password\": \"\",\n" +
                "  \"timestamp\": null,\n" +
                "  \"sign\": \"\"\n" +
                "}";
        PushEvent pushEvent = new Gson().fromJson(event1, PushEvent.class);
        System.out.println(pushEvent.compare);
    }
}
