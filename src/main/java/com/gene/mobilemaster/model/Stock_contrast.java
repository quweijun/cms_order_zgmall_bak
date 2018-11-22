package com.gene.mobilemaster.model;

import java.util.Date;

public class Stock_contrast {
    private Integer id;

    private String typename;

    private String productid;

    private String productname;

    private String prodcolor;

    private String prodsize;

    private Integer total;

    private Integer collectTotal;

    private Integer shijikc;

    private Integer collectShijikc;

    private Integer xiaoshoukc;

    private Integer collectXiaoshoukc;

    private Integer daipeihuo;

    private Integer collectDaipeihuo;

    private Date updatetime;

    private Date addtime;

    private Date xiugaitime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
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

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCollectTotal() {
        return collectTotal;
    }

    public void setCollectTotal(Integer collectTotal) {
        this.collectTotal = collectTotal;
    }

    public Integer getShijikc() {
        return shijikc;
    }

    public void setShijikc(Integer shijikc) {
        this.shijikc = shijikc;
    }

    public Integer getCollectShijikc() {
        return collectShijikc;
    }

    public void setCollectShijikc(Integer collectShijikc) {
        this.collectShijikc = collectShijikc;
    }

    public Integer getXiaoshoukc() {
        return xiaoshoukc;
    }

    public void setXiaoshoukc(Integer xiaoshoukc) {
        this.xiaoshoukc = xiaoshoukc;
    }

    public Integer getCollectXiaoshoukc() {
        return collectXiaoshoukc;
    }

    public void setCollectXiaoshoukc(Integer collectXiaoshoukc) {
        this.collectXiaoshoukc = collectXiaoshoukc;
    }

    public Integer getDaipeihuo() {
        return daipeihuo;
    }

    public void setDaipeihuo(Integer daipeihuo) {
        this.daipeihuo = daipeihuo;
    }

    public Integer getCollectDaipeihuo() {
        return collectDaipeihuo;
    }

    public void setCollectDaipeihuo(Integer collectDaipeihuo) {
        this.collectDaipeihuo = collectDaipeihuo;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getXiugaitime() {
        return xiugaitime;
    }

    public void setXiugaitime(Date xiugaitime) {
        this.xiugaitime = xiugaitime;
    }
}