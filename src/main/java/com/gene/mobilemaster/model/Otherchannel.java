package com.gene.mobilemaster.model;

import java.util.Date;

public class Otherchannel {
    private Date accesstime;

    private String channelid;

    private Integer rksum;

    private Integer yxrksum;

    private Integer yxpvsum;

    private Integer yxyhsum;

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

    public Integer getYxrksum() {
        return yxrksum;
    }

    public void setYxrksum(Integer yxrksum) {
        this.yxrksum = yxrksum;
    }

    public Integer getYxpvsum() {
        return yxpvsum;
    }

    public void setYxpvsum(Integer yxpvsum) {
        this.yxpvsum = yxpvsum;
    }

    public Integer getYxyhsum() {
        return yxyhsum;
    }

    public void setYxyhsum(Integer yxyhsum) {
        this.yxyhsum = yxyhsum;
    }
}