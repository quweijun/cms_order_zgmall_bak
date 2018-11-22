package com.gene.mobilemaster.model;

import java.util.Date;

public class Online_interflow {
    private Integer msgid;

    private String senderid;

    private String receiverid;

    private Integer typeid;

    private Integer classid;

    private String content;

    private Date senddate;

    private Integer isread;

    private Date readtime;

    private Integer islock;

    private Integer senderlock;

    private Integer receiverlock;

    public Integer getMsgid() {
        return msgid;
    }

    public void setMsgid(Integer msgid) {
        this.msgid = msgid;
    }

    public String getSenderid() {
        return senderid;
    }

    public void setSenderid(String senderid) {
        this.senderid = senderid == null ? null : senderid.trim();
    }

    public String getReceiverid() {
        return receiverid;
    }

    public void setReceiverid(String receiverid) {
        this.receiverid = receiverid == null ? null : receiverid.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getSenddate() {
        return senddate;
    }

    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }

    public Integer getIsread() {
        return isread;
    }

    public void setIsread(Integer isread) {
        this.isread = isread;
    }

    public Date getReadtime() {
        return readtime;
    }

    public void setReadtime(Date readtime) {
        this.readtime = readtime;
    }

    public Integer getIslock() {
        return islock;
    }

    public void setIslock(Integer islock) {
        this.islock = islock;
    }

    public Integer getSenderlock() {
        return senderlock;
    }

    public void setSenderlock(Integer senderlock) {
        this.senderlock = senderlock;
    }

    public Integer getReceiverlock() {
        return receiverlock;
    }

    public void setReceiverlock(Integer receiverlock) {
        this.receiverlock = receiverlock;
    }
}