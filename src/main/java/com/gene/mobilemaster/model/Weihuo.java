package com.gene.mobilemaster.model;

import java.util.Date;

public class Weihuo {
    private String productid;

    private String color;

    private String size;

    private Double flags;

    private Date addtime;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public Double getFlags() {
        return flags;
    }

    public void setFlags(Double flags) {
        this.flags = flags;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}