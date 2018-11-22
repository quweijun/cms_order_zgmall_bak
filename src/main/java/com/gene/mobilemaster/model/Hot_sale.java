package com.gene.mobilemaster.model;

import java.util.Date;

public class Hot_sale {
    private String productid;

    private Integer prodtype;

    private Date addtime;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Integer getProdtype() {
        return prodtype;
    }

    public void setProdtype(Integer prodtype) {
        this.prodtype = prodtype;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}