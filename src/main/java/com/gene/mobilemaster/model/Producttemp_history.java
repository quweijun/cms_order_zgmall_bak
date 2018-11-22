package com.gene.mobilemaster.model;

import java.util.Date;

public class Producttemp_history {
    private String productid;

    private Integer bigtype;

    private Integer smalltype;

    private Integer subclass;

    private String productname;

    private Date cpaddtime;

    private String ggy;

    private String img;

    private Integer payment;

    private Double price;

    private String saleflag;

    private Double zgprice;

    private Double marketprice;

    private Double vipprice;

    private Integer cnt;

    private Date begindate;

    private Date enddate;

    private Date updatetime;

    private Integer ordercount;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Integer getBigtype() {
        return bigtype;
    }

    public void setBigtype(Integer bigtype) {
        this.bigtype = bigtype;
    }

    public Integer getSmalltype() {
        return smalltype;
    }

    public void setSmalltype(Integer smalltype) {
        this.smalltype = smalltype;
    }

    public Integer getSubclass() {
        return subclass;
    }

    public void setSubclass(Integer subclass) {
        this.subclass = subclass;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public Date getCpaddtime() {
        return cpaddtime;
    }

    public void setCpaddtime(Date cpaddtime) {
        this.cpaddtime = cpaddtime;
    }

    public String getGgy() {
        return ggy;
    }

    public void setGgy(String ggy) {
        this.ggy = ggy == null ? null : ggy.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSaleflag() {
        return saleflag;
    }

    public void setSaleflag(String saleflag) {
        this.saleflag = saleflag == null ? null : saleflag.trim();
    }

    public Double getZgprice() {
        return zgprice;
    }

    public void setZgprice(Double zgprice) {
        this.zgprice = zgprice;
    }

    public Double getMarketprice() {
        return marketprice;
    }

    public void setMarketprice(Double marketprice) {
        this.marketprice = marketprice;
    }

    public Double getVipprice() {
        return vipprice;
    }

    public void setVipprice(Double vipprice) {
        this.vipprice = vipprice;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getOrdercount() {
        return ordercount;
    }

    public void setOrdercount(Integer ordercount) {
        this.ordercount = ordercount;
    }
}