package cn.wildfirechat.app.gitee.pojo;

public class Repository {
//        "id": 151,
    public int id;
//                "name": "Gitee FeedBack",
    public String name;
//                "path": "git-osc",
    public String path;
//                "full_name": "oschina/git-osc",
    public String full_name;
//                "owner": {
//            "login": "oschina-org",
//                    "avatar_url": "https://gitee.com/assets/favicon.ico",
//                    "html_url": "https://gitee.com/oschina-org",
//                    "type": "User",
//                    "site_admin": false,
//                    "id": 1,
//                    "name": "Gitee",
//                    "email": "gitee@gitee.com",
//                    "username": "oschina-org",
//                    "user_name": "oschina-org",
//                    "url": "https://gitee.com/oschina-org"
//        },
    public User owner;
//        "private": false,
//    public boolean private;
//                "html_url": "https://gitee.com/oschina/git-osc",
    public String html_url;
//                "url": "https://gitee.com/oschina/git-osc",
    public String url;
//                "description": "",
    public String description;
//                "fork": false,
    public boolean fork;
//                "created_at": "2020-04-15T21:09:40+08:00",
    public String created_at;
//                "updated_at": "2020-04-15T21:09:40+08:00",
    public String updated_at;
//                "pushed_at": "2020-04-15T21:09:40+08:00",
    public String pushed_at;
//                "git_url": "git://gitee.com:oschina/git-osc.git",
    public String git_url;
//                "ssh_url": "git@gitee.com:oschina/git-osc.git",
    public String ssh_url;
//                "clone_url": "https://gitee.com/oschina/git-osc.git",
    public String clone_url;
//                "svn_url": "svn://gitee.com/oschina/git-osc",
    public String svn_url;
//                "git_http_url": "https://gitee.com/oschina/git-osc.git",
    public String git_http_url;
//                "git_ssh_url": "git@gitee.com:oschina/git-osc.git",
    public String git_ssh_url;
//                "git_svn_url": "svn://gitee.com/oschina/git-osc",
    public String git_svn_url;
//                "homepage": null,
    public String homepage;
//                "stargazers_count": 11,
    public int stargazers_count;
//                "watchers_count": 12,
    public int watchers_count;
//                "forks_count": 0,
    public int forks_count;
//                "language": "ruby",
    public String language;
//                "has_issues": true,
    public boolean has_issues;
//                "has_wiki": true,
    public boolean has_wiki;
//                "has_pages": false,
    public boolean has_pages;
//                "license": null,
    public String license;
//                "open_issues_count": 0,
    public int open_issues_count;
//                "default_branch": "master",
    public String default_branch;
//                "namespace": "oschina",
    public String namespace;
//                "name_with_namespace": "OSCHINA/git-osc",
    public String name_with_namespace;
//                "path_with_namespace": "oschina/git-osc"
    public String path_with_namespace;

}
