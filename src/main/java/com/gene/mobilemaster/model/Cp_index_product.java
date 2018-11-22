package com.gene.mobilemaster.model;

public class Cp_index_product {
    private String productid;

    private String img;

    private String ggy;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getGgy() {
        return ggy;
    }

    public void setGgy(String ggy) {
        this.ggy = ggy == null ? null : ggy.trim();
    }
}