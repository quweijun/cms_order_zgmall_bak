package com.gene.mobilemaster.model;

import java.util.Date;

public class Ad_location_relation {
    private Integer dataid;

    private Integer adid;

    private Integer location;

    private Integer kidlocation;

    private Integer enableflag;

    private Date addtime;

    private Double addor;

    public Integer getDataid() {
        return dataid;
    }

    public void setDataid(Integer dataid) {
        this.dataid = dataid;
    }

    public Integer getAdid() {
        return adid;
    }

    public void setAdid(Integer adid) {
        this.adid = adid;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public Integer getKidlocation() {
        return kidlocation;
    }

    public void setKidlocation(Integer kidlocation) {
        this.kidlocation = kidlocation;
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

    public Double getAddor() {
        return addor;
    }

    public void setAddor(Double addor) {
        this.addor = addor;
    }
}