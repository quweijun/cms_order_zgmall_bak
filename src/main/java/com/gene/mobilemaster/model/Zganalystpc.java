package com.gene.mobilemaster.model;

import java.util.Date;

public class Zganalystpc {
    private Date accesstime;

    private String channelid;

    private Integer sessionid;

    private Integer pcsum;

    public Date getAccesstime() {
        return accesstime;
    }

    public void setAccesstime(Date accesstime) {
        this.accesstime = accesstime;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public Integer getSessionid() {
        return sessionid;
    }

    public void setSessionid(Integer sessionid) {
        this.sessionid = sessionid;
    }

    public Integer getPcsum() {
        return pcsum;
    }

    public void setPcsum(Integer pcsum) {
        this.pcsum = pcsum;
    }
}