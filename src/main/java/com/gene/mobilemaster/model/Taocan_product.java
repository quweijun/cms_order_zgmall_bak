package com.gene.mobilemaster.model;

import java.util.Date;

public class Taocan_product {
    private Integer flowno;

    private String productid;

    private Integer tcid;

    private Date addtime;

    private Integer xh;

    private Integer flag;

    private Integer typeflag;

    private Double yhmoney;

    private Date lastupdatetime;

    private String lastupdateuser;

    public Integer getFlowno() {
        return flowno;
    }

    public void setFlowno(Integer flowno) {
        this.flowno = flowno;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Integer getTcid() {
        return tcid;
    }

    public void setTcid(Integer tcid) {
        this.tcid = tcid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getTypeflag() {
        return typeflag;
    }

    public void setTypeflag(Integer typeflag) {
        this.typeflag = typeflag;
    }

    public Double getYhmoney() {
        return yhmoney;
    }

    public void setYhmoney(Double yhmoney) {
        this.yhmoney = yhmoney;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public String getLastupdateuser() {
        return lastupdateuser;
    }

    public void setLastupdateuser(String lastupdateuser) {
        this.lastupdateuser = lastupdateuser == null ? null : lastupdateuser.trim();
    }
}