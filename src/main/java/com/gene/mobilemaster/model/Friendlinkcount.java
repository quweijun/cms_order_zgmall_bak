package com.gene.mobilemaster.model;

public class Friendlinkcount {
    private String accesstime;

    private String channelid;

    private Integer rksum;

    private Integer yxrksum;

    private Integer yxpvsum;

    private Integer yxyhsum;

    public String getAccesstime() {
        return accesstime;
    }

    public void setAccesstime(String accesstime) {
        this.accesstime = accesstime == null ? null : accesstime.trim();
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