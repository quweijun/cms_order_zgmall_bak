package com.gene.mobilemaster.model;

import java.util.Date;

public class Pvfinally_01 {
    private Date accesstime;

    private String channelid;

    private Integer rksum;

    private Integer yxrksum;

    private Integer yxpvsum;

    private Integer yxyhsum;

    private String endsum;

    private Integer dpvsum;

    private Integer spvsum;

    private Integer ch;

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

    public String getEndsum() {
        return endsum;
    }

    public void setEndsum(String endsum) {
        this.endsum = endsum == null ? null : endsum.trim();
    }

    public Integer getDpvsum() {
        return dpvsum;
    }

    public void setDpvsum(Integer dpvsum) {
        this.dpvsum = dpvsum;
    }

    public Integer getSpvsum() {
        return spvsum;
    }

    public void setSpvsum(Integer spvsum) {
        this.spvsum = spvsum;
    }

    public Integer getCh() {
        return ch;
    }

    public void setCh(Integer ch) {
        this.ch = ch;
    }
}