package com.gene.mobilemaster.model;

import java.util.Date;

public class Androidregcount {
    private Integer flowid;

    private String channelid;

    private String username;

    private String androidversion;

    private Date addtime;

    private String unique;

    public Integer getFlowid() {
        return flowid;
    }

    public void setFlowid(Integer flowid) {
        this.flowid = flowid;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getAndroidversion() {
        return androidversion;
    }

    public void setAndroidversion(String androidversion) {
        this.androidversion = androidversion == null ? null : androidversion.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getUnique() {
        return unique;
    }

    public void setUnique(String unique) {
        this.unique = unique == null ? null : unique.trim();
    }
}