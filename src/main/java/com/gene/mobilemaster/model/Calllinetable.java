package com.gene.mobilemaster.model;

import java.util.Date;

public class Calllinetable {
    private String channelid;

    private Date accesstime;

    private String callLineId;

    private Integer pv;

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public Date getAccesstime() {
        return accesstime;
    }

    public void setAccesstime(Date accesstime) {
        this.accesstime = accesstime;
    }

    public String getCallLineId() {
        return callLineId;
    }

    public void setCallLineId(String callLineId) {
        this.callLineId = callLineId == null ? null : callLineId.trim();
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }
}