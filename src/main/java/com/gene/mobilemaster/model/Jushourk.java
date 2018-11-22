package com.gene.mobilemaster.model;

public class Jushourk {
    private String productid;

    private String prodcolor;

    private Double shuliang;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getProdcolor() {
        return prodcolor;
    }

    public void setProdcolor(String prodcolor) {
        this.prodcolor = prodcolor == null ? null : prodcolor.trim();
    }

    public Double getShuliang() {
        return shuliang;
    }

    public void setShuliang(Double shuliang) {
        this.shuliang = shuliang;
    }
}