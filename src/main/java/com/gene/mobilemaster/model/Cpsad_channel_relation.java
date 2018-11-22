package com.gene.mobilemaster.model;

import java.util.Date;

public class Cpsad_channel_relation {
    private Integer id;

    private String channelid;

    private String advertisementid;

    private Double pvprice;

    private Double pvpriceReal;

    private Double pay;

    private Double payReal;

    private Date addtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getAdvertisementid() {
        return advertisementid;
    }

    public void setAdvertisementid(String advertisementid) {
        this.advertisementid = advertisementid == null ? null : advertisementid.trim();
    }

    public Double getPvprice() {
        return pvprice;
    }

    public void setPvprice(Double pvprice) {
        this.pvprice = pvprice;
    }

    public Double getPvpriceReal() {
        return pvpriceReal;
    }

    public void setPvpriceReal(Double pvpriceReal) {
        this.pvpriceReal = pvpriceReal;
    }

    public Double getPay() {
        return pay;
    }

    public void setPay(Double pay) {
        this.pay = pay;
    }

    public Double getPayReal() {
        return payReal;
    }

    public void setPayReal(Double payReal) {
        this.payReal = payReal;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}