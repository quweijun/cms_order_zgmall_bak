package com.gene.mobilemaster.model;

import java.util.Date;

public class Guestzfstatis_onday {
    private Date countdate;

    private String urlmd5name;

    private Long guestid;

    private Integer zfllcs;

    private Integer hjflag;

    public Date getCountdate() {
        return countdate;
    }

    public void setCountdate(Date countdate) {
        this.countdate = countdate;
    }

    public String getUrlmd5name() {
        return urlmd5name;
    }

    public void setUrlmd5name(String urlmd5name) {
        this.urlmd5name = urlmd5name == null ? null : urlmd5name.trim();
    }

    public Long getGuestid() {
        return guestid;
    }

    public void setGuestid(Long guestid) {
        this.guestid = guestid;
    }

    public Integer getZfllcs() {
        return zfllcs;
    }

    public void setZfllcs(Integer zfllcs) {
        this.zfllcs = zfllcs;
    }

    public Integer getHjflag() {
        return hjflag;
    }

    public void setHjflag(Integer hjflag) {
        this.hjflag = hjflag;
    }
}