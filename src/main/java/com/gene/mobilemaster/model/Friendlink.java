package com.gene.mobilemaster.model;

import java.util.Date;

public class Friendlink {
    private Date countdate;

    private String siteflag;

    private String channelid;

    private String shortname;

    private Integer bottom;

    private Long realincount;

    private Date uptime;

    public Date getCountdate() {
        return countdate;
    }

    public void setCountdate(Date countdate) {
        this.countdate = countdate;
    }

    public String getSiteflag() {
        return siteflag;
    }

    public void setSiteflag(String siteflag) {
        this.siteflag = siteflag == null ? null : siteflag.trim();
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname == null ? null : shortname.trim();
    }

    public Integer getBottom() {
        return bottom;
    }

    public void setBottom(Integer bottom) {
        this.bottom = bottom;
    }

    public Long getRealincount() {
        return realincount;
    }

    public void setRealincount(Long realincount) {
        this.realincount = realincount;
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }
}