package com.gene.mobilemaster.model;

import java.util.Date;

public class Purchase_orders {
    private String typename;

    private String productid;

    private String productname;

    private String prodcolor;

    private String prodsize;

    private String barcodeid;

    private Integer daifahuo;

    private Integer kucun;

    private Integer daicaigou;

    private Integer caigou;

    private Date caigoutime;

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

    public String getBarcodeid() {
        return barcodeid;
    }

    public void setBarcodeid(String barcodeid) {
        this.barcodeid = barcodeid == null ? null : barcodeid.trim();
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

    public Integer getDaicaigou() {
        return daicaigou;
    }

    public void setDaicaigou(Integer daicaigou) {
        this.daicaigou = daicaigou;
    }

    public Integer getCaigou() {
        return caigou;
    }

    public void setCaigou(Integer caigou) {
        this.caigou = caigou;
    }

    public Date getCaigoutime() {
        return caigoutime;
    }

    public void setCaigoutime(Date caigoutime) {
        this.caigoutime = caigoutime;
    }
}