package com.gene.mobilemaster.model;

public class Tmp2_dingdan {
    private String productid;

    private Integer cpcount;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Integer getCpcount() {
        return cpcount;
    }

    public void setCpcount(Integer cpcount) {
        this.cpcount = cpcount;
    }
}