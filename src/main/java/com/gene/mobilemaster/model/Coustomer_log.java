package com.gene.mobilemaster.model;

import java.util.Date;

public class Coustomer_log {
    private String sessionid;

    private String sessionid2;

    private String userid;

    private String channelid;

    private String mobile;

    private Date addtime;

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid == null ? null : sessionid.trim();
    }

    public String getSessionid2() {
        return sessionid2;
    }

    public void setSessionid2(String sessionid2) {
        this.sessionid2 = sessionid2 == null ? null : sessionid2.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}