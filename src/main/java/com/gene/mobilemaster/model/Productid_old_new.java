package com.gene.mobilemaster.model;

public class Productid_old_new {
    private String productidOld;

    private String productidNew;

    public String getProductidOld() {
        return productidOld;
    }

    public void setProductidOld(String productidOld) {
        this.productidOld = productidOld == null ? null : productidOld.trim();
    }

    public String getProductidNew() {
        return productidNew;
    }

    public void setProductidNew(String productidNew) {
        this.productidNew = productidNew == null ? null : productidNew.trim();
    }
}