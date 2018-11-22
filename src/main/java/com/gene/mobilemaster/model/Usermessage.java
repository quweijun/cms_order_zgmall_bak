package com.gene.mobilemaster.model;

import java.util.Date;

public class Usermessage {
    private Long flowno;

    private Integer msgid;

    private String senderid;

    private String receiverid;

    private String sendrole;

    private String receiverrole;

    private Integer typeid;

    private Integer classid;

    private String images;

    private String content;

    private String actions;

    private Date senddate;

    private Integer isread;

    private Date readtime;

    private Integer issys;

    private Integer islock;

    private Integer isshare;

    private Integer senderlock;

    private Integer receiverlock;

    public Long getFlowno() {
        return flowno;
    }

    public void setFlowno(Long flowno) {
        this.flowno = flowno;
    }

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

    public String getSendrole() {
        return sendrole;
    }

    public void setSendrole(String sendrole) {
        this.sendrole = sendrole == null ? null : sendrole.trim();
    }

    public String getReceiverrole() {
        return receiverrole;
    }

    public void setReceiverrole(String receiverrole) {
        this.receiverrole = receiverrole == null ? null : receiverrole.trim();
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

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions == null ? null : actions.trim();
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

    public Integer getIssys() {
        return issys;
    }

    public void setIssys(Integer issys) {
        this.issys = issys;
    }

    public Integer getIslock() {
        return islock;
    }

    public void setIslock(Integer islock) {
        this.islock = islock;
    }

    public Integer getIsshare() {
        return isshare;
    }

    public void setIsshare(Integer isshare) {
        this.isshare = isshare;
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