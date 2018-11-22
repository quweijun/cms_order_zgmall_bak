package com.gene.mobilemaster.model;

import java.util.Date;

public class Pricearea {
    private Integer priceareaid;

    private Integer bigtype;

    private Integer smalltype;

    private Integer subclass;

    private String title;

    private String priceareadesc;

    private Double beginprice;

    private Double endprice;

    private Integer flag;

    private String addtor;

    private Date addtime;

    private Integer orders;

    private String androidDesc;

    public Integer getPriceareaid() {
        return priceareaid;
    }

    public void setPriceareaid(Integer priceareaid) {
        this.priceareaid = priceareaid;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPriceareadesc() {
        return priceareadesc;
    }

    public void setPriceareadesc(String priceareadesc) {
        this.priceareadesc = priceareadesc == null ? null : priceareadesc.trim();
    }

    public Double getBeginprice() {
        return beginprice;
    }

    public void setBeginprice(Double beginprice) {
        this.beginprice = beginprice;
    }

    public Double getEndprice() {
        return endprice;
    }

    public void setEndprice(Double endprice) {
        this.endprice = endprice;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getAddtor() {
        return addtor;
    }

    public void setAddtor(String addtor) {
        this.addtor = addtor == null ? null : addtor.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public String getAndroidDesc() {
        return androidDesc;
    }

    public void setAndroidDesc(String androidDesc) {
        this.androidDesc = androidDesc == null ? null : androidDesc.trim();
    }
}