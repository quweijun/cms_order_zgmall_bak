package com.gene.mobilemaster.model;

public class Threeimportzg_prodlib {
    private String productname;

    private String productid;

    private Double cgjg;

    private Double zgjg;

    private String prodcolor;

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Double getCgjg() {
        return cgjg;
    }

    public void setCgjg(Double cgjg) {
        this.cgjg = cgjg;
    }

    public Double getZgjg() {
        return zgjg;
    }

    public void setZgjg(Double zgjg) {
        this.zgjg = zgjg;
    }

    public String getProdcolor() {
        return prodcolor;
    }

    public void setProdcolor(String prodcolor) {
        this.prodcolor = prodcolor == null ? null : prodcolor.trim();
    }
}