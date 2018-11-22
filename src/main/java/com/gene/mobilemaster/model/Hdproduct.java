package com.gene.mobilemaster.model;

import java.util.Date;

public class Hdproduct {
    private Integer id;

    private Integer hdid;

    private String productid;

    private String productggr;

    private Integer bigtype;

    private Integer smalltype;

    private Integer photoflag;

    private String custphoto;

    private Integer rebate;

    private Double jtzk;

    private Integer taxis;

    private Date addtime;

    private String addor;

    private Integer flag;

    private String producturl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHdid() {
        return hdid;
    }

    public void setHdid(Integer hdid) {
        this.hdid = hdid;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getProductggr() {
        return productggr;
    }

    public void setProductggr(String productggr) {
        this.productggr = productggr == null ? null : productggr.trim();
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

    public Integer getPhotoflag() {
        return photoflag;
    }

    public void setPhotoflag(Integer photoflag) {
        this.photoflag = photoflag;
    }

    public String getCustphoto() {
        return custphoto;
    }

    public void setCustphoto(String custphoto) {
        this.custphoto = custphoto == null ? null : custphoto.trim();
    }

    public Integer getRebate() {
        return rebate;
    }

    public void setRebate(Integer rebate) {
        this.rebate = rebate;
    }

    public Double getJtzk() {
        return jtzk;
    }

    public void setJtzk(Double jtzk) {
        this.jtzk = jtzk;
    }

    public Integer getTaxis() {
        return taxis;
    }

    public void setTaxis(Integer taxis) {
        this.taxis = taxis;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getAddor() {
        return addor;
    }

    public void setAddor(String addor) {
        this.addor = addor == null ? null : addor.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getProducturl() {
        return producturl;
    }

    public void setProducturl(String producturl) {
        this.producturl = producturl == null ? null : producturl.trim();
    }
}