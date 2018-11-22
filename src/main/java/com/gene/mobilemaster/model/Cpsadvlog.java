package com.gene.mobilemaster.model;

import java.util.Date;

public class Cpsadvlog {
    private Integer id;

    private String advertisementid;

    private String verifyid;

    private Integer adtype;

    private String adurl;

    private Integer enableflag;

    private String operator;

    private Date addtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdvertisementid() {
        return advertisementid;
    }

    public void setAdvertisementid(String advertisementid) {
        this.advertisementid = advertisementid == null ? null : advertisementid.trim();
    }

    public String getVerifyid() {
        return verifyid;
    }

    public void setVerifyid(String verifyid) {
        this.verifyid = verifyid == null ? null : verifyid.trim();
    }

    public Integer getAdtype() {
        return adtype;
    }

    public void setAdtype(Integer adtype) {
        this.adtype = adtype;
    }

    public String getAdurl() {
        return adurl;
    }

    public void setAdurl(String adurl) {
        this.adurl = adurl == null ? null : adurl.trim();
    }

    public Integer getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Integer enableflag) {
        this.enableflag = enableflag;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}