package com.gene.mobilemaster.model;

import java.util.Date;

public class Pingjiareply {
    private Double flowid;

    private Integer postid;

    private String reply;

    private String username;

    private String updateUser;

    private Date updateDate;

    private Integer islock;

    private Integer issys;

    private String sessionid;

    private Date adddate;

    private Integer rplevel;

    public Double getFlowid() {
        return flowid;
    }

    public void setFlowid(Double flowid) {
        this.flowid = flowid;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply == null ? null : reply.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getIslock() {
        return islock;
    }

    public void setIslock(Integer islock) {
        this.islock = islock;
    }

    public Integer getIssys() {
        return issys;
    }

    public void setIssys(Integer issys) {
        this.issys = issys;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid == null ? null : sessionid.trim();
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public Integer getRplevel() {
        return rplevel;
    }

    public void setRplevel(Integer rplevel) {
        this.rplevel = rplevel;
    }
}