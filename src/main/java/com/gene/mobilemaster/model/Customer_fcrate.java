package com.gene.mobilemaster.model;

import java.util.Date;

public class Customer_fcrate {
    private Long customerid;

    private String jssjb;

    private String jssjbmc;

    private Double zjccbl;

    private Integer enableflag;

    private Date addtime;

    public Long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Long customerid) {
        this.customerid = customerid;
    }

    public String getJssjb() {
        return jssjb;
    }

    public void setJssjb(String jssjb) {
        this.jssjb = jssjb == null ? null : jssjb.trim();
    }

    public String getJssjbmc() {
        return jssjbmc;
    }

    public void setJssjbmc(String jssjbmc) {
        this.jssjbmc = jssjbmc == null ? null : jssjbmc.trim();
    }

    public Double getZjccbl() {
        return zjccbl;
    }

    public void setZjccbl(Double zjccbl) {
        this.zjccbl = zjccbl;
    }

    public Integer getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Integer enableflag) {
        this.enableflag = enableflag;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}