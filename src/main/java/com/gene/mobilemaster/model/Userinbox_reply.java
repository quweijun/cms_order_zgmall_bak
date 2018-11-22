package com.gene.mobilemaster.model;

import java.util.Date;

public class Userinbox_reply {
    private Integer replyid;

    private String msgno;

    private String sender;

    private String rplevel;

    private Integer replyUserid;

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

    public String getRplevel() {
        return rplevel;
    }

    public void setRplevel(String rplevel) {
        this.rplevel = rplevel == null ? null : rplevel.trim();
    }

    public Integer getReplyUserid() {
        return replyUserid;
    }

    public void setReplyUserid(Integer replyUserid) {
        this.replyUserid = replyUserid;
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