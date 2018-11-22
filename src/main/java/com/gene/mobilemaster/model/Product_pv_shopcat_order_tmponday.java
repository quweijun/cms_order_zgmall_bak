package com.gene.mobilemaster.model;

import java.util.Date;

public class Product_pv_shopcat_order_tmponday {
    private Date countdate;

    private String productid;

    private Integer visitcount;

    private Integer inshopcatnum;

    private Integer allorder;

    private Integer ensureorder;

    private Integer channelcount;

    public Date getCountdate() {
        return countdate;
    }

    public void setCountdate(Date countdate) {
        this.countdate = countdate;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Integer getVisitcount() {
        return visitcount;
    }

    public void setVisitcount(Integer visitcount) {
        this.visitcount = visitcount;
    }

    public Integer getInshopcatnum() {
        return inshopcatnum;
    }

    public void setInshopcatnum(Integer inshopcatnum) {
        this.inshopcatnum = inshopcatnum;
    }

    public Integer getAllorder() {
        return allorder;
    }

    public void setAllorder(Integer allorder) {
        this.allorder = allorder;
    }

    public Integer getEnsureorder() {
        return ensureorder;
    }

    public void setEnsureorder(Integer ensureorder) {
        this.ensureorder = ensureorder;
    }

    public Integer getChannelcount() {
        return channelcount;
    }

    public void setChannelcount(Integer channelcount) {
        this.channelcount = channelcount;
    }
}