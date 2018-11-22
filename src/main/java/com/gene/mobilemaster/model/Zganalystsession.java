package com.gene.mobilemaster.model;

import java.util.Date;

public class Zganalystsession {
    private Date accesstime;

    private String channelid;

    private Integer sessionid;

    private Integer pvsum;

    private Integer pindaoname;

    private String pindaourl;

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

    public Integer getPvsum() {
        return pvsum;
    }

    public void setPvsum(Integer pvsum) {
        this.pvsum = pvsum;
    }

    public Integer getPindaoname() {
        return pindaoname;
    }

    public void setPindaoname(Integer pindaoname) {
        this.pindaoname = pindaoname;
    }

    public String getPindaourl() {
        return pindaourl;
    }

    public void setPindaourl(String pindaourl) {
        this.pindaourl = pindaourl == null ? null : pindaourl.trim();
    }
}