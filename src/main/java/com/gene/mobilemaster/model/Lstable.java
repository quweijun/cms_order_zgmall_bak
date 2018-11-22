package com.gene.mobilemaster.model;

public class Lstable {
    private Integer sessionid;

    private Integer rk;

    private String channelid;

    private String accesstime;

    private String callLineId;

    public Integer getSessionid() {
        return sessionid;
    }

    public void setSessionid(Integer sessionid) {
        this.sessionid = sessionid;
    }

    public Integer getRk() {
        return rk;
    }

    public void setRk(Integer rk) {
        this.rk = rk;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getAccesstime() {
        return accesstime;
    }

    public void setAccesstime(String accesstime) {
        this.accesstime = accesstime == null ? null : accesstime.trim();
    }

    public String getCallLineId() {
        return callLineId;
    }

    public void setCallLineId(String callLineId) {
        this.callLineId = callLineId == null ? null : callLineId.trim();
    }
}