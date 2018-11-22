package com.gene.mobilemaster.model;

import java.util.Date;

public class Barcode {
    private Double barcodeid;

    private String rknumber;

    private String productid;

    private Date addtime;

    private String addor;

    public Double getBarcodeid() {
        return barcodeid;
    }

    public void setBarcodeid(Double barcodeid) {
        this.barcodeid = barcodeid;
    }

    public String getRknumber() {
        return rknumber;
    }

    public void setRknumber(String rknumber) {
        this.rknumber = rknumber == null ? null : rknumber.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
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
}