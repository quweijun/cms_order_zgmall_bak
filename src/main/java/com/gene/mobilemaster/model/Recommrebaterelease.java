package com.gene.mobilemaster.model;

import java.util.Date;

public class Recommrebaterelease {
    private Date countdate;

    private String channelid;

    private Integer channeltype;

    private Integer rebateordercount;

    private Double rebateordersumamount;

    private Double rebateamount;

    private Integer csettleflag;

    private Integer csettleid;

    private Integer publishflag;

    public Date getCountdate() {
        return countdate;
    }

    public void setCountdate(Date countdate) {
        this.countdate = countdate;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public Integer getChanneltype() {
        return channeltype;
    }

    public void setChanneltype(Integer channeltype) {
        this.channeltype = channeltype;
    }

    public Integer getRebateordercount() {
        return rebateordercount;
    }

    public void setRebateordercount(Integer rebateordercount) {
        this.rebateordercount = rebateordercount;
    }

    public Double getRebateordersumamount() {
        return rebateordersumamount;
    }

    public void setRebateordersumamount(Double rebateordersumamount) {
        this.rebateordersumamount = rebateordersumamount;
    }

    public Double getRebateamount() {
        return rebateamount;
    }

    public void setRebateamount(Double rebateamount) {
        this.rebateamount = rebateamount;
    }

    public Integer getCsettleflag() {
        return csettleflag;
    }

    public void setCsettleflag(Integer csettleflag) {
        this.csettleflag = csettleflag;
    }

    public Integer getCsettleid() {
        return csettleid;
    }

    public void setCsettleid(Integer csettleid) {
        this.csettleid = csettleid;
    }

    public Integer getPublishflag() {
        return publishflag;
    }

    public void setPublishflag(Integer publishflag) {
        this.publishflag = publishflag;
    }
}