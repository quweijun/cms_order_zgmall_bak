package com.gene.mobilemaster.model;

import java.util.Date;

public class Channelidorder {
    private Date countdate;

    private String channelid;

    private Integer allorder;

    private Integer ensureorder;

    private Integer ensureorder2;

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

    public Integer getAllorder() {
        return allorder;
    }

    public void setAllorder(Integer allorder) {
        this.allorder = allorder;
    }

    public Integer getEnsureorder() {
        return ensureorder;
    }

    public void setEnsureorder(Integer ensureorder) {
        this.ensureorder = ensureorder;
    }

    public Integer getEnsureorder2() {
        return ensureorder2;
    }

    public void setEnsureorder2(Integer ensureorder2) {
        this.ensureorder2 = ensureorder2;
    }
}