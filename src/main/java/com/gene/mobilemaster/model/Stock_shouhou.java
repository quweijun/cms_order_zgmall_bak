package com.gene.mobilemaster.model;

import java.util.Date;

public class Stock_shouhou {
    private Integer id;

    private String orderid;

    private String bussinessname;

    private String barcodeid;

    private Integer handMethod;

    private Integer cllx;

    private Integer wxzt;

    private Integer rkzt;

    private Date edittime;

    private Date endtime;

    private Integer shId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getBussinessname() {
        return bussinessname;
    }

    public void setBussinessname(String bussinessname) {
        this.bussinessname = bussinessname == null ? null : bussinessname.trim();
    }

    public String getBarcodeid() {
        return barcodeid;
    }

    public void setBarcodeid(String barcodeid) {
        this.barcodeid = barcodeid == null ? null : barcodeid.trim();
    }

    public Integer getHandMethod() {
        return handMethod;
    }

    public void setHandMethod(Integer handMethod) {
        this.handMethod = handMethod;
    }

    public Integer getCllx() {
        return cllx;
    }

    public void setCllx(Integer cllx) {
        this.cllx = cllx;
    }

    public Integer getWxzt() {
        return wxzt;
    }

    public void setWxzt(Integer wxzt) {
        this.wxzt = wxzt;
    }

    public Integer getRkzt() {
        return rkzt;
    }

    public void setRkzt(Integer rkzt) {
        this.rkzt = rkzt;
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getShId() {
        return shId;
    }

    public void setShId(Integer shId) {
        this.shId = shId;
    }
}