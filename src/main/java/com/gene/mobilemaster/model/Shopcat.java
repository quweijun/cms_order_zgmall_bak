package com.gene.mobilemaster.model;

import java.util.Date;

public class Shopcat {
    private String sessionid;

    private String productid;

    private String prodcolor;

    private String prodsize;

    private Double price;

    private Double deliveryprice;

    private Double addgold;

    private Integer amount;

    private String largess;

    private String jpid;

    private Integer prodtype;

    private Integer prodflag;

    private String channelid;

    private String userid;

    private Integer promotionsid;

    private Date addtime;

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid == null ? null : sessionid.trim();
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDeliveryprice() {
        return deliveryprice;
    }

    public void setDeliveryprice(Double deliveryprice) {
        this.deliveryprice = deliveryprice;
    }

    public Double getAddgold() {
        return addgold;
    }

    public void setAddgold(Double addgold) {
        this.addgold = addgold;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getLargess() {
        return largess;
    }

    public void setLargess(String largess) {
        this.largess = largess == null ? null : largess.trim();
    }

    public String getJpid() {
        return jpid;
    }

    public void setJpid(String jpid) {
        this.jpid = jpid == null ? null : jpid.trim();
    }

    public Integer getProdtype() {
        return prodtype;
    }

    public void setProdtype(Integer prodtype) {
        this.prodtype = prodtype;
    }

    public Integer getProdflag() {
        return prodflag;
    }

    public void setProdflag(Integer prodflag) {
        this.prodflag = prodflag;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getPromotionsid() {
        return promotionsid;
    }

    public void setPromotionsid(Integer promotionsid) {
        this.promotionsid = promotionsid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}