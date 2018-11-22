package com.gene.mobilemaster.model;

import java.util.Date;

public class Synchronous_product_log {
    private Integer id;

    private String productid;

    private String prodcolor;

    private String prodsize;

    private Date adddate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getProdsize() {
        return prodsize;
    }

    public void setProdsize(String prodsize) {
        this.prodsize = prodsize == null ? null : prodsize.trim();
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }
}