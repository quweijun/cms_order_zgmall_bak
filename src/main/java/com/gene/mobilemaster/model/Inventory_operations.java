package com.gene.mobilemaster.model;

import java.util.Date;

public class Inventory_operations {
    private Double id;

    private String productid;

    private String prodcolor;

    private String prodsize;

    private String editor;

    private String shijikc;

    private String xiaoshoukc;

    private Integer kucun;

    private String gMAddress;

    private Date addtime;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
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

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public String getShijikc() {
        return shijikc;
    }

    public void setShijikc(String shijikc) {
        this.shijikc = shijikc == null ? null : shijikc.trim();
    }

    public String getXiaoshoukc() {
        return xiaoshoukc;
    }

    public void setXiaoshoukc(String xiaoshoukc) {
        this.xiaoshoukc = xiaoshoukc == null ? null : xiaoshoukc.trim();
    }

    public Integer getKucun() {
        return kucun;
    }

    public void setKucun(Integer kucun) {
        this.kucun = kucun;
    }

    public String getgMAddress() {
        return gMAddress;
    }

    public void setgMAddress(String gMAddress) {
        this.gMAddress = gMAddress == null ? null : gMAddress.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}