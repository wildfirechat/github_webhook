package cn.wildfirechat.app.pojo;

import com.google.gson.Gson;

public class PullRequestEvent {
    public PullRequest pull_request;
    public Repository repository;
    public User sender;

    public static PullRequestEvent fromJson(String jsonStr) {
        return new Gson().fromJson(jsonStr, PullRequestEvent.class);
    }
    public static void main(String[] args) {
        String event1 = "{\"action\":\"opened\",\"number\":234,\"pull_request\":{\"url\":\"https://api.github.com/repos/wildfirechat/ios-chat/pulls/234\",\"id\":472308019,\"node_id\":\"MDExOlB1bGxSZXF1ZXN0NDcyMzA4MDE5\",\"html_url\":\"https://github.com/wildfirechat/ios-chat/pull/234\",\"diff_url\":\"https://github.com/wildfirechat/ios-chat/pull/234.diff\",\"patch_url\":\"https://github.com/wildfirechat/ios-chat/pull/234.patch\",\"issue_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/issues/234\",\"number\":234,\"state\":\"open\",\"locked\":false,\"title\":\"iCloud Driver 问题\",\"user\":{\"login\":\"ManBuTianYa\",\"id\":16189552,\"node_id\":\"MDQ6VXNlcjE2MTg5NTUy\",\"avatar_url\":\"https://avatars1.githubusercontent.com/u/16189552?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/ManBuTianYa\",\"html_url\":\"https://github.com/ManBuTianYa\",\"followers_url\":\"https://api.github.com/users/ManBuTianYa/followers\",\"following_url\":\"https://api.github.com/users/ManBuTianYa/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/ManBuTianYa/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/ManBuTianYa/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/ManBuTianYa/subscriptions\",\"organizations_url\":\"https://api.github.com/users/ManBuTianYa/orgs\",\"repos_url\":\"https://api.github.com/users/ManBuTianYa/repos\",\"events_url\":\"https://api.github.com/users/ManBuTianYa/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/ManBuTianYa/received_events\",\"type\":\"User\",\"site_admin\":false},\"body\":\"模拟器发送文件正常， 真机下发送崩溃。\",\"created_at\":\"2020-08-24T06:59:34Z\",\"updated_at\":\"2020-08-24T06:59:34Z\",\"closed_at\":null,\"merged_at\":null,\"merge_commit_sha\":null,\"assignee\":null,\"assignees\":[],\"requested_reviewers\":[],\"requested_teams\":[],\"labels\":[],\"milestone\":null,\"draft\":false,\"commits_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/pulls/234/commits\",\"review_comments_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/pulls/234/comments\",\"review_comment_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/pulls/comments{/number}\",\"comments_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/issues/234/comments\",\"statuses_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/statuses/d09a7ca9d9b7c0deb1392650aa343339086ee997\",\"head\":{\"label\":\"ManBuTianYa:master\",\"ref\":\"master\",\"sha\":\"d09a7ca9d9b7c0deb1392650aa343339086ee997\",\"user\":{\"login\":\"ManBuTianYa\",\"id\":16189552,\"node_id\":\"MDQ6VXNlcjE2MTg5NTUy\",\"avatar_url\":\"https://avatars1.githubusercontent.com/u/16189552?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/ManBuTianYa\",\"html_url\":\"https://github.com/ManBuTianYa\",\"followers_url\":\"https://api.github.com/users/ManBuTianYa/followers\",\"following_url\":\"https://api.github.com/users/ManBuTianYa/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/ManBuTianYa/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/ManBuTianYa/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/ManBuTianYa/subscriptions\",\"organizations_url\":\"https://api.github.com/users/ManBuTianYa/orgs\",\"repos_url\":\"https://api.github.com/users/ManBuTianYa/repos\",\"events_url\":\"https://api.github.com/users/ManBuTianYa/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/ManBuTianYa/received_events\",\"type\":\"User\",\"site_admin\":false},\"repo\":{\"id\":289814706,\"node_id\":\"MDEwOlJlcG9zaXRvcnkyODk4MTQ3MDY=\",\"name\":\"ios-chat\",\"full_name\":\"ManBuTianYa/ios-chat\",\"private\":false,\"owner\":{\"login\":\"ManBuTianYa\",\"id\":16189552,\"node_id\":\"MDQ6VXNlcjE2MTg5NTUy\",\"avatar_url\":\"https://avatars1.githubusercontent.com/u/16189552?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/ManBuTianYa\",\"html_url\":\"https://github.com/ManBuTianYa\",\"followers_url\":\"https://api.github.com/users/ManBuTianYa/followers\",\"following_url\":\"https://api.github.com/users/ManBuTianYa/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/ManBuTianYa/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/ManBuTianYa/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/ManBuTianYa/subscriptions\",\"organizations_url\":\"https://api.github.com/users/ManBuTianYa/orgs\",\"repos_url\":\"https://api.github.com/users/ManBuTianYa/repos\",\"events_url\":\"https://api.github.com/users/ManBuTianYa/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/ManBuTianYa/received_events\",\"type\":\"User\",\"site_admin\":false},\"html_url\":\"https://github.com/ManBuTianYa/ios-chat\",\"description\":\"开源的即时通讯(野火IM)系统\",\"fork\":true,\"url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat\",\"forks_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/forks\",\"keys_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/keys{/key_id}\",\"collaborators_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/collaborators{/collaborator}\",\"teams_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/teams\",\"hooks_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/hooks\",\"issue_events_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/issues/events{/number}\",\"events_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/events\",\"assignees_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/assignees{/user}\",\"branches_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/branches{/branch}\",\"tags_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/tags\",\"blobs_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/git/blobs{/sha}\",\"git_tags_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/git/tags{/sha}\",\"git_refs_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/git/refs{/sha}\",\"trees_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/git/trees{/sha}\",\"statuses_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/statuses/{sha}\",\"languages_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/languages\",\"stargazers_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/stargazers\",\"contributors_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/contributors\",\"subscribers_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/subscribers\",\"subscription_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/subscription\",\"commits_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/commits{/sha}\",\"git_commits_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/git/commits{/sha}\",\"comments_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/comments{/number}\",\"issue_comment_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/issues/comments{/number}\",\"contents_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/contents/{+path}\",\"compare_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/compare/{base}...{head}\",\"merges_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/merges\",\"archive_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/{archive_format}{/ref}\",\"downloads_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/downloads\",\"issues_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/issues{/number}\",\"pulls_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/pulls{/number}\",\"milestones_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/milestones{/number}\",\"notifications_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/notifications{?since,all,participating}\",\"labels_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/labels{/name}\",\"releases_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/releases{/id}\",\"deployments_url\":\"https://api.github.com/repos/ManBuTianYa/ios-chat/deployments\",\"created_at\":\"2020-08-24T03:05:35Z\",\"updated_at\":\"2020-08-24T06:53:04Z\",\"pushed_at\":\"2020-08-24T06:52:59Z\",\"git_url\":\"git://github.com/ManBuTianYa/ios-chat.git\",\"ssh_url\":\"git@github.com:ManBuTianYa/ios-chat.git\",\"clone_url\":\"https://github.com/ManBuTianYa/ios-chat.git\",\"svn_url\":\"https://github.com/ManBuTianYa/ios-chat\",\"homepage\":\"http://docs.wildfirechat.cn\",\"size\":402374,\"stargazers_count\":0,\"watchers_count\":0,\"language\":\"Objective-C\",\"has_issues\":false,\"has_projects\":true,\"has_downloads\":true,\"has_wiki\":true,\"has_pages\":false,\"forks_count\":0,\"mirror_url\":null,\"archived\":false,\"disabled\":false,\"open_issues_count\":0,\"license\":{\"key\":\"other\",\"name\":\"Other\",\"spdx_id\":\"NOASSERTION\",\"url\":null,\"node_id\":\"MDc6TGljZW5zZTA=\"},\"forks\":0,\"open_issues\":0,\"watchers\":0,\"default_branch\":\"master\",\"allow_squash_merge\":true,\"allow_merge_commit\":true,\"allow_rebase_merge\":true,\"delete_branch_on_merge\":false}},\"base\":{\"label\":\"wildfirechat:master\",\"ref\":\"master\",\"sha\":\"7c49cb7785cf2cf70205d225f52ac6e6485e56a8\",\"user\":{\"login\":\"wildfirechat\",\"id\":33191460,\"node_id\":\"MDEyOk9yZ2FuaXphdGlvbjMzMTkxNDYw\",\"avatar_url\":\"https://avatars0.githubusercontent.com/u/33191460?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/wildfirechat\",\"html_url\":\"https://github.com/wildfirechat\",\"followers_url\":\"https://api.github.com/users/wildfirechat/followers\",\"following_url\":\"https://api.github.com/users/wildfirechat/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/wildfirechat/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/wildfirechat/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/wildfirechat/subscriptions\",\"organizations_url\":\"https://api.github.com/users/wildfirechat/orgs\",\"repos_url\":\"https://api.github.com/users/wildfirechat/repos\",\"events_url\":\"https://api.github.com/users/wildfirechat/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/wildfirechat/received_events\",\"type\":\"Organization\",\"site_admin\":false},\"repo\":{\"id\":167198690,\"node_id\":\"MDEwOlJlcG9zaXRvcnkxNjcxOTg2OTA=\",\"name\":\"ios-chat\",\"full_name\":\"wildfirechat/ios-chat\",\"private\":false,\"owner\":{\"login\":\"wildfirechat\",\"id\":33191460,\"node_id\":\"MDEyOk9yZ2FuaXphdGlvbjMzMTkxNDYw\",\"avatar_url\":\"https://avatars0.githubusercontent.com/u/33191460?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/wildfirechat\",\"html_url\":\"https://github.com/wildfirechat\",\"followers_url\":\"https://api.github.com/users/wildfirechat/followers\",\"following_url\":\"https://api.github.com/users/wildfirechat/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/wildfirechat/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/wildfirechat/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/wildfirechat/subscriptions\",\"organizations_url\":\"https://api.github.com/users/wildfirechat/orgs\",\"repos_url\":\"https://api.github.com/users/wildfirechat/repos\",\"events_url\":\"https://api.github.com/users/wildfirechat/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/wildfirechat/received_events\",\"type\":\"Organization\",\"site_admin\":false},\"html_url\":\"https://github.com/wildfirechat/ios-chat\",\"description\":\"开源的即时通讯(野火IM)系统\",\"fork\":false,\"url\":\"https://api.github.com/repos/wildfirechat/ios-chat\",\"forks_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/forks\",\"keys_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/keys{/key_id}\",\"collaborators_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/collaborators{/collaborator}\",\"teams_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/teams\",\"hooks_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/hooks\",\"issue_events_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/issues/events{/number}\",\"events_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/events\",\"assignees_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/assignees{/user}\",\"branches_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/branches{/branch}\",\"tags_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/tags\",\"blobs_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/git/blobs{/sha}\",\"git_tags_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/git/tags{/sha}\",\"git_refs_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/git/refs{/sha}\",\"trees_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/git/trees{/sha}\",\"statuses_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/statuses/{sha}\",\"languages_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/languages\",\"stargazers_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/stargazers\",\"contributors_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/contributors\",\"subscribers_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/subscribers\",\"subscription_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/subscription\",\"commits_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/commits{/sha}\",\"git_commits_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/git/commits{/sha}\",\"comments_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/comments{/number}\",\"issue_comment_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/issues/comments{/number}\",\"contents_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/contents/{+path}\",\"compare_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/compare/{base}...{head}\",\"merges_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/merges\",\"archive_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/{archive_format}{/ref}\",\"downloads_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/downloads\",\"issues_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/issues{/number}\",\"pulls_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/pulls{/number}\",\"milestones_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/milestones{/number}\",\"notifications_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/notifications{?since,all,participating}\",\"labels_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/labels{/name}\",\"releases_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/releases{/id}\",\"deployments_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/deployments\",\"created_at\":\"2019-01-23T14:41:53Z\",\"updated_at\":\"2020-08-23T08:41:29Z\",\"pushed_at\":\"2020-08-19T10:30:48Z\",\"git_url\":\"git://github.com/wildfirechat/ios-chat.git\",\"ssh_url\":\"git@github.com:wildfirechat/ios-chat.git\",\"clone_url\":\"https://github.com/wildfirechat/ios-chat.git\",\"svn_url\":\"https://github.com/wildfirechat/ios-chat\",\"homepage\":\"http://docs.wildfirechat.cn\",\"size\":402374,\"stargazers_count\":766,\"watchers_count\":766,\"language\":\"Objective-C\",\"has_issues\":true,\"has_projects\":true,\"has_downloads\":true,\"has_wiki\":true,\"has_pages\":false,\"forks_count\":356,\"mirror_url\":null,\"archived\":false,\"disabled\":false,\"open_issues_count\":20,\"license\":{\"key\":\"other\",\"name\":\"Other\",\"spdx_id\":\"NOASSERTION\",\"url\":null,\"node_id\":\"MDc6TGljZW5zZTA=\"},\"forks\":356,\"open_issues\":20,\"watchers\":766,\"default_branch\":\"master\",\"allow_squash_merge\":true,\"allow_merge_commit\":true,\"allow_rebase_merge\":true,\"delete_branch_on_merge\":false}},\"_links\":{\"self\":{\"href\":\"https://api.github.com/repos/wildfirechat/ios-chat/pulls/234\"},\"html\":{\"href\":\"https://github.com/wildfirechat/ios-chat/pull/234\"},\"issue\":{\"href\":\"https://api.github.com/repos/wildfirechat/ios-chat/issues/234\"},\"comments\":{\"href\":\"https://api.github.com/repos/wildfirechat/ios-chat/issues/234/comments\"},\"review_comments\":{\"href\":\"https://api.github.com/repos/wildfirechat/ios-chat/pulls/234/comments\"},\"review_comment\":{\"href\":\"https://api.github.com/repos/wildfirechat/ios-chat/pulls/comments{/number}\"},\"commits\":{\"href\":\"https://api.github.com/repos/wildfirechat/ios-chat/pulls/234/commits\"},\"statuses\":{\"href\":\"https://api.github.com/repos/wildfirechat/ios-chat/statuses/d09a7ca9d9b7c0deb1392650aa343339086ee997\"}},\"author_association\":\"NONE\",\"active_lock_reason\":null,\"merged\":false,\"mergeable\":null,\"rebaseable\":null,\"mergeable_state\":\"unknown\",\"merged_by\":null,\"comments\":0,\"review_comments\":0,\"maintainer_can_modify\":true,\"commits\":1,\"additions\":68,\"deletions\":7,\"changed_files\":1},\"repository\":{\"id\":167198690,\"node_id\":\"MDEwOlJlcG9zaXRvcnkxNjcxOTg2OTA=\",\"name\":\"ios-chat\",\"full_name\":\"wildfirechat/ios-chat\",\"private\":false,\"owner\":{\"login\":\"wildfirechat\",\"id\":33191460,\"node_id\":\"MDEyOk9yZ2FuaXphdGlvbjMzMTkxNDYw\",\"avatar_url\":\"https://avatars0.githubusercontent.com/u/33191460?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/wildfirechat\",\"html_url\":\"https://github.com/wildfirechat\",\"followers_url\":\"https://api.github.com/users/wildfirechat/followers\",\"following_url\":\"https://api.github.com/users/wildfirechat/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/wildfirechat/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/wildfirechat/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/wildfirechat/subscriptions\",\"organizations_url\":\"https://api.github.com/users/wildfirechat/orgs\",\"repos_url\":\"https://api.github.com/users/wildfirechat/repos\",\"events_url\":\"https://api.github.com/users/wildfirechat/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/wildfirechat/received_events\",\"type\":\"Organization\",\"site_admin\":false},\"html_url\":\"https://github.com/wildfirechat/ios-chat\",\"description\":\"开源的即时通讯(野火IM)系统\",\"fork\":false,\"url\":\"https://api.github.com/repos/wildfirechat/ios-chat\",\"forks_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/forks\",\"keys_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/keys{/key_id}\",\"collaborators_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/collaborators{/collaborator}\",\"teams_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/teams\",\"hooks_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/hooks\",\"issue_events_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/issues/events{/number}\",\"events_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/events\",\"assignees_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/assignees{/user}\",\"branches_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/branches{/branch}\",\"tags_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/tags\",\"blobs_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/git/blobs{/sha}\",\"git_tags_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/git/tags{/sha}\",\"git_refs_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/git/refs{/sha}\",\"trees_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/git/trees{/sha}\",\"statuses_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/statuses/{sha}\",\"languages_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/languages\",\"stargazers_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/stargazers\",\"contributors_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/contributors\",\"subscribers_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/subscribers\",\"subscription_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/subscription\",\"commits_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/commits{/sha}\",\"git_commits_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/git/commits{/sha}\",\"comments_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/comments{/number}\",\"issue_comment_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/issues/comments{/number}\",\"contents_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/contents/{+path}\",\"compare_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/compare/{base}...{head}\",\"merges_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/merges\",\"archive_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/{archive_format}{/ref}\",\"downloads_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/downloads\",\"issues_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/issues{/number}\",\"pulls_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/pulls{/number}\",\"milestones_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/milestones{/number}\",\"notifications_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/notifications{?since,all,participating}\",\"labels_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/labels{/name}\",\"releases_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/releases{/id}\",\"deployments_url\":\"https://api.github.com/repos/wildfirechat/ios-chat/deployments\",\"created_at\":\"2019-01-23T14:41:53Z\",\"updated_at\":\"2020-08-23T08:41:29Z\",\"pushed_at\":\"2020-08-19T10:30:48Z\",\"git_url\":\"git://github.com/wildfirechat/ios-chat.git\",\"ssh_url\":\"git@github.com:wildfirechat/ios-chat.git\",\"clone_url\":\"https://github.com/wildfirechat/ios-chat.git\",\"svn_url\":\"https://github.com/wildfirechat/ios-chat\",\"homepage\":\"http://docs.wildfirechat.cn\",\"size\":402374,\"stargazers_count\":766,\"watchers_count\":766,\"language\":\"Objective-C\",\"has_issues\":true,\"has_projects\":true,\"has_downloads\":true,\"has_wiki\":true,\"has_pages\":false,\"forks_count\":356,\"mirror_url\":null,\"archived\":false,\"disabled\":false,\"open_issues_count\":20,\"license\":{\"key\":\"other\",\"name\":\"Other\",\"spdx_id\":\"NOASSERTION\",\"url\":null,\"node_id\":\"MDc6TGljZW5zZTA=\"},\"forks\":356,\"open_issues\":20,\"watchers\":766,\"default_branch\":\"master\"},\"organization\":{\"login\":\"wildfirechat\",\"id\":33191460,\"node_id\":\"MDEyOk9yZ2FuaXphdGlvbjMzMTkxNDYw\",\"url\":\"https://api.github.com/orgs/wildfirechat\",\"repos_url\":\"https://api.github.com/orgs/wildfirechat/repos\",\"events_url\":\"https://api.github.com/orgs/wildfirechat/events\",\"hooks_url\":\"https://api.github.com/orgs/wildfirechat/hooks\",\"issues_url\":\"https://api.github.com/orgs/wildfirechat/issues\",\"members_url\":\"https://api.github.com/orgs/wildfirechat/members{/member}\",\"public_members_url\":\"https://api.github.com/orgs/wildfirechat/public_members{/member}\",\"avatar_url\":\"https://avatars0.githubusercontent.com/u/33191460?v=4\",\"description\":\"北京野火无限网络科技有限公司--专注于即时通讯技术，提供优质可控的即时通讯能力\"},\"sender\":{\"login\":\"ManBuTianYa\",\"id\":16189552,\"node_id\":\"MDQ6VXNlcjE2MTg5NTUy\",\"avatar_url\":\"https://avatars1.githubusercontent.com/u/16189552?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/ManBuTianYa\",\"html_url\":\"https://github.com/ManBuTianYa\",\"followers_url\":\"https://api.github.com/users/ManBuTianYa/followers\",\"following_url\":\"https://api.github.com/users/ManBuTianYa/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/ManBuTianYa/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/ManBuTianYa/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/ManBuTianYa/subscriptions\",\"organizations_url\":\"https://api.github.com/users/ManBuTianYa/orgs\",\"repos_url\":\"https://api.github.com/users/ManBuTianYa/repos\",\"events_url\":\"https://api.github.com/users/ManBuTianYa/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/ManBuTianYa/received_events\",\"type\":\"User\",\"site_admin\":false}}";
        PullRequestEvent pullRequestEvent = fromJson(event1);
        System.out.println(pullRequestEvent.pull_request.title);
    }
}
