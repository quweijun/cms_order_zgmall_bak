package com.gene.mobilemaster.model;

import java.util.Date;

public class Link_count {
    private String channelid;

    private Date countdate;

    private Long accessincount;

    private Long realincount;

    private Long accessoutcount;

    private Long realoutcount;

    private Long fangliangcount;

    private Long realfanglinagcout;

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public Date getCountdate() {
        return countdate;
    }

    public void setCountdate(Date countdate) {
        this.countdate = countdate;
    }

    public Long getAccessincount() {
        return accessincount;
    }

    public void setAccessincount(Long accessincount) {
        this.accessincount = accessincount;
    }

    public Long getRealincount() {
        return realincount;
    }

    public void setRealincount(Long realincount) {
        this.realincount = realincount;
    }

    public Long getAccessoutcount() {
        return accessoutcount;
    }

    public void setAccessoutcount(Long accessoutcount) {
        this.accessoutcount = accessoutcount;
    }

    public Long getRealoutcount() {
        return realoutcount;
    }

    public void setRealoutcount(Long realoutcount) {
        this.realoutcount = realoutcount;
    }

    public Long getFangliangcount() {
        return fangliangcount;
    }

    public void setFangliangcount(Long fangliangcount) {
        this.fangliangcount = fangliangcount;
    }

    public Long getRealfanglinagcout() {
        return realfanglinagcout;
    }

    public void setRealfanglinagcout(Long realfanglinagcout) {
        this.realfanglinagcout = realfanglinagcout;
    }
}