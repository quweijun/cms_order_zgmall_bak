package com.gene.mobilemaster.model;

public class Producttable_noflag {
    private String productid;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }
}