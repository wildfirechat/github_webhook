package cn.wildfirechat.app.gitee.pojo;

public class NoteEvent {
    public String action;
    public Issue issue;
    public Comment comment;

    public Repository repository;
    public User author;

    public User sender;
    public String url;
    public String note;
    public String title;
    public String noteable_type;
    public int noteable_id;
    public String per_iid;
    public String short_commit_id;
    public Enterprise enterprise;
    public String hook_name;
    public long hook_id;
    public String hook_url;
    public String password;
    public String timestamp;
    public String sign;
}
