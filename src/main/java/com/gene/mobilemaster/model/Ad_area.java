package com.gene.mobilemaster.model;

import java.util.Date;

public class Ad_area {
    private Integer adid;

    private Integer location;

    private Integer kidlocation;

    private Integer subchannel;

    private String number;

    private String title;

    private Integer adtype;

    private String adpict;

    private String adurl;

    private Date addtime;

    private String addor;

    private Integer phtoflag;

    private Integer flag;

    private Integer amount;

    private Integer serialnumber;

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

    public Integer getSubchannel() {
        return subchannel;
    }

    public void setSubchannel(Integer subchannel) {
        this.subchannel = subchannel;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
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

    public String getAdpict() {
        return adpict;
    }

    public void setAdpict(String adpict) {
        this.adpict = adpict == null ? null : adpict.trim();
    }

    public String getAdurl() {
        return adurl;
    }

    public void setAdurl(String adurl) {
        this.adurl = adurl == null ? null : adurl.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getAddor() {
        return addor;
    }

    public void setAddor(String addor) {
        this.addor = addor == null ? null : addor.trim();
    }

    public Integer getPhtoflag() {
        return phtoflag;
    }

    public void setPhtoflag(Integer phtoflag) {
        this.phtoflag = phtoflag;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(Integer serialnumber) {
        this.serialnumber = serialnumber;
    }
}