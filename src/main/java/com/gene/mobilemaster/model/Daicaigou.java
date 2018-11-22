package com.gene.mobilemaster.model;

import java.util.Date;

public class Daicaigou {
    private Integer id;

    private String typename;

    private String productid;

    private String productname;

    private String prodcolor;

    private String prodsize;

    private Integer daifahuo;

    private Integer kucun;

    private Integer surplus;

    private Integer caigou;

    private Date caigouTime;

    private Integer flag;

    private Date addtime;

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

    public Integer getDaifahuo() {
        return daifahuo;
    }

    public void setDaifahuo(Integer daifahuo) {
        this.daifahuo = daifahuo;
    }

    public Integer getKucun() {
        return kucun;
    }

    public void setKucun(Integer kucun) {
        this.kucun = kucun;
    }

    public Integer getSurplus() {
        return surplus;
    }

    public void setSurplus(Integer surplus) {
        this.surplus = surplus;
    }

    public Integer getCaigou() {
        return caigou;
    }

    public void setCaigou(Integer caigou) {
        this.caigou = caigou;
    }

    public Date getCaigouTime() {
        return caigouTime;
    }

    public void setCaigouTime(Date caigouTime) {
        this.caigouTime = caigouTime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}