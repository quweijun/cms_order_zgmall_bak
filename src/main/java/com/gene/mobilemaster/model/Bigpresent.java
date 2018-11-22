package com.gene.mobilemaster.model;

import java.util.Date;

public class Bigpresent {
    private Integer id;

    private String productid;

    private String nonPjname;

    private String nonPjphoto;

    private String nonPjdesc;

    private Integer enableflag;

    private Integer adduserid;

    private Date addtime;

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

    public String getNonPjname() {
        return nonPjname;
    }

    public void setNonPjname(String nonPjname) {
        this.nonPjname = nonPjname == null ? null : nonPjname.trim();
    }

    public String getNonPjphoto() {
        return nonPjphoto;
    }

    public void setNonPjphoto(String nonPjphoto) {
        this.nonPjphoto = nonPjphoto == null ? null : nonPjphoto.trim();
    }

    public String getNonPjdesc() {
        return nonPjdesc;
    }

    public void setNonPjdesc(String nonPjdesc) {
        this.nonPjdesc = nonPjdesc == null ? null : nonPjdesc.trim();
    }

    public Integer getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Integer enableflag) {
        this.enableflag = enableflag;
    }

    public Integer getAdduserid() {
        return adduserid;
    }

    public void setAdduserid(Integer adduserid) {
        this.adduserid = adduserid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}