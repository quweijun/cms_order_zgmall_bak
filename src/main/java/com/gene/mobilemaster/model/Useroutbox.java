package com.gene.mobilemaster.model;

import java.util.Date;

public class Useroutbox {
    private Integer flowid;

    private String msgno;

    private String replyno;

    private String username;

    private String getter;

    private Integer classid;

    private String title;

    private Date senddate;

    private Integer isdraft;

    private Integer issys;

    private Integer isshare;

    private String content;

    public Integer getFlowid() {
        return flowid;
    }

    public void setFlowid(Integer flowid) {
        this.flowid = flowid;
    }

    public String getMsgno() {
        return msgno;
    }

    public void setMsgno(String msgno) {
        this.msgno = msgno == null ? null : msgno.trim();
    }

    public String getReplyno() {
        return replyno;
    }

    public void setReplyno(String replyno) {
        this.replyno = replyno == null ? null : replyno.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getGetter() {
        return getter;
    }

    public void setGetter(String getter) {
        this.getter = getter == null ? null : getter.trim();
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getSenddate() {
        return senddate;
    }

    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }

    public Integer getIsdraft() {
        return isdraft;
    }

    public void setIsdraft(Integer isdraft) {
        this.isdraft = isdraft;
    }

    public Integer getIssys() {
        return issys;
    }

    public void setIssys(Integer issys) {
        this.issys = issys;
    }

    public Integer getIsshare() {
        return isshare;
    }

    public void setIsshare(Integer isshare) {
        this.isshare = isshare;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}