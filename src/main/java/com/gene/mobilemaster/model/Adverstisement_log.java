package com.gene.mobilemaster.model;

import java.util.Date;

public class Adverstisement_log {
    private Double id;

    private Integer adid;

    private String title;

    private Integer adtype;

    private Date addtime;

    private Integer kidlocation;

    private Integer subchannel;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Integer getAdid() {
        return adid;
    }

    public void setAdid(Integer adid) {
        this.adid = adid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getAdtype() {
        return adtype;
    }

    public void setAdtype(Integer adtype) {
        this.adtype = adtype;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getKidlocation() {
        return kidlocation;
    }

    public void setKidlocation(Integer kidlocation) {
        this.kidlocation = kidlocation;
    }

    public Integer getSubchannel() {
        return subchannel;
    }

    public void setSubchannel(Integer subchannel) {
        this.subchannel = subchannel;
    }
}