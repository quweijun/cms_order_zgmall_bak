package com.gene.mobilemaster.model;

public class Stock_color_bk {
    private String productid;

    private String colorlist;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getColorlist() {
        return colorlist;
    }

    public void setColorlist(String colorlist) {
        this.colorlist = colorlist == null ? null : colorlist.trim();
    }
}