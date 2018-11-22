package com.gene.mobilemaster.model;

import java.util.Date;

public class Fangtable {
    private Long flowid;

    private String channelid;

    private Date fangdate;

    private Long fangcount;

    private String fangflag;

    private Long havefang;

    private Date accesstime;

    private Date successtime;

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

    public Date getFangdate() {
        return fangdate;
    }

    public void setFangdate(Date fangdate) {
        this.fangdate = fangdate;
    }

    public Long getFangcount() {
        return fangcount;
    }

    public void setFangcount(Long fangcount) {
        this.fangcount = fangcount;
    }

    public String getFangflag() {
        return fangflag;
    }

    public void setFangflag(String fangflag) {
        this.fangflag = fangflag == null ? null : fangflag.trim();
    }

    public Long getHavefang() {
        return havefang;
    }

    public void setHavefang(Long havefang) {
        this.havefang = havefang;
    }

    public Date getAccesstime() {
        return accesstime;
    }

    public void setAccesstime(Date accesstime) {
        this.accesstime = accesstime;
    }

    public Date getSuccesstime() {
        return successtime;
    }

    public void setSuccesstime(Date successtime) {
        this.successtime = successtime;
    }
}