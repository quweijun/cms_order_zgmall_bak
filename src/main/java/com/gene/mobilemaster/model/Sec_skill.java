package com.gene.mobilemaster.model;

import java.util.Date;

public class Sec_skill {
    private String secid;

    private String coustmorid;

    private Date addtime;

    private String channelid;

    private String coustmerip;

    private String moblie;

    public String getSecid() {
        return secid;
    }

    public void setSecid(String secid) {
        this.secid = secid == null ? null : secid.trim();
    }

    public String getCoustmorid() {
        return coustmorid;
    }

    public void setCoustmorid(String coustmorid) {
        this.coustmorid = coustmorid == null ? null : coustmorid.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getCoustmerip() {
        return coustmerip;
    }

    public void setCoustmerip(String coustmerip) {
        this.coustmerip = coustmerip == null ? null : coustmerip.trim();
    }

    public String getMoblie() {
        return moblie;
    }

    public void setMoblie(String moblie) {
        this.moblie = moblie == null ? null : moblie.trim();
    }
}