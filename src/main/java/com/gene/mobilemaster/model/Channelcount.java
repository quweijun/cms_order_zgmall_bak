package com.gene.mobilemaster.model;

import java.util.Date;

public class Channelcount {
    private Date accesstime;

    private Integer sessionid;

    private String channelid;

    private Integer pvcount;

    private Integer usercount;

    public Date getAccesstime() {
        return accesstime;
    }

    public void setAccesstime(Date accesstime) {
        this.accesstime = accesstime;
    }

    public Integer getSessionid() {
        return sessionid;
    }

    public void setSessionid(Integer sessionid) {
        this.sessionid = sessionid;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public Integer getPvcount() {
        return pvcount;
    }

    public void setPvcount(Integer pvcount) {
        this.pvcount = pvcount;
    }

    public Integer getUsercount() {
        return usercount;
    }

    public void setUsercount(Integer usercount) {
        this.usercount = usercount;
    }
}