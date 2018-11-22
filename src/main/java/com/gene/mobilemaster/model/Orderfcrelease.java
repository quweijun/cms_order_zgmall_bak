package com.gene.mobilemaster.model;

import java.util.Date;

public class Orderfcrelease {
    private Date countdate;

    private String channelid;

    private Integer ordersigncount;

    private Integer channeltype;

    private Double signamount;

    private Double fcamount;

    private Integer csettleflag;

    private Integer csettleid;

    private String pchannelid;

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

    public Integer getOrdersigncount() {
        return ordersigncount;
    }

    public void setOrdersigncount(Integer ordersigncount) {
        this.ordersigncount = ordersigncount;
    }

    public Integer getChanneltype() {
        return channeltype;
    }

    public void setChanneltype(Integer channeltype) {
        this.channeltype = channeltype;
    }

    public Double getSignamount() {
        return signamount;
    }

    public void setSignamount(Double signamount) {
        this.signamount = signamount;
    }

    public Double getFcamount() {
        return fcamount;
    }

    public void setFcamount(Double fcamount) {
        this.fcamount = fcamount;
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

    public String getPchannelid() {
        return pchannelid;
    }

    public void setPchannelid(String pchannelid) {
        this.pchannelid = pchannelid == null ? null : pchannelid.trim();
    }

    public Integer getPublishflag() {
        return publishflag;
    }

    public void setPublishflag(Integer publishflag) {
        this.publishflag = publishflag;
    }
}