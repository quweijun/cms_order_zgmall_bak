package com.gene.mobilemaster.model;

import java.util.Date;

public class Useroutbox_reply {
    private Integer replyid;

    private String msgno;

    private String sender;

    private Integer rplevel;

    private String replyUserid;

    private String replyContent;

    private Date replyAddtime;

    public Integer getReplyid() {
        return replyid;
    }

    public void setReplyid(Integer replyid) {
        this.replyid = replyid;
    }

    public String getMsgno() {
        return msgno;
    }

    public void setMsgno(String msgno) {
        this.msgno = msgno == null ? null : msgno.trim();
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public Integer getRplevel() {
        return rplevel;
    }

    public void setRplevel(Integer rplevel) {
        this.rplevel = rplevel;
    }

    public String getReplyUserid() {
        return replyUserid;
    }

    public void setReplyUserid(String replyUserid) {
        this.replyUserid = replyUserid == null ? null : replyUserid.trim();
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }

    public Date getReplyAddtime() {
        return replyAddtime;
    }

    public void setReplyAddtime(Date replyAddtime) {
        this.replyAddtime = replyAddtime;
    }
}