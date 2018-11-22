package com.gene.mobilemaster.model;

import java.util.Date;

public class Getchannelpv {
    private Date accesstime;

    private String channelid;

    private Integer rkpvsum;

    private Integer pvsum;

    private Integer yhsum;

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

    public Integer getRkpvsum() {
        return rkpvsum;
    }

    public void setRkpvsum(Integer rkpvsum) {
        this.rkpvsum = rkpvsum;
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
}