package com.gene.mobilemaster.model;

import java.util.Date;

public class Zganalystchannel {
    private Date accesstime;

    private String channelid;

    private Integer rksum;

    private Integer pvsum;

    private Integer yhsum;

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

    public Integer getRksum() {
        return rksum;
    }

    public void setRksum(Integer rksum) {
        this.rksum = rksum;
    }

    public Integer getPvsum() {
        return pvsum;
    }

    public void setPvsum(Integer pvsum) {
        this.pvsum = pvsum;
    }

    public Integer getYhsum() {
        return yhsum;
    }

    public void setYhsum(Integer yhsum) {
        this.yhsum = yhsum;
    }

    public Integer getPcsum() {
        return pcsum;
    }

    public void setPcsum(Integer pcsum) {
        this.pcsum = pcsum;
    }
}