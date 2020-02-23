package cn.wildfirechat.app.pojo;

import java.util.Date;

public class Commit {
    public String id;
    public String tree_id;
    public Date timestamp;
    public String sha;
    public String message;
    public Pusher author;
    public String url;
    public boolean distinct;
    public String[] added;
    public String[] removed;
    public String[] modified;
}
