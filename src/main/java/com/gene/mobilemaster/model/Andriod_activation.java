package com.gene.mobilemaster.model;

import java.util.Date;

public class Andriod_activation {
    private Long flowid;

    private String channelid;

    private String uniqueid;

    private Date activedate;

    private Date effectivedate;

    private Date lastoperadate;

    private Long operacount;

    private Date addtime;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid == null ? null : uniqueid.trim();
    }

    public Date getActivedate() {
        return activedate;
    }

    public void setActivedate(Date activedate) {
        this.activedate = activedate;
    }

    public Date getEffectivedate() {
        return effectivedate;
    }

    public void setEffectivedate(Date effectivedate) {
        this.effectivedate = effectivedate;
    }

    public Date getLastoperadate() {
        return lastoperadate;
    }

    public void setLastoperadate(Date lastoperadate) {
        this.lastoperadate = lastoperadate;
    }

    public Long getOperacount() {
        return operacount;
    }

    public void setOperacount(Long operacount) {
        this.operacount = operacount;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}