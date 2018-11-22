package com.gene.mobilemaster.model;

import java.util.Date;

public class Expressyoufeitemp_excel {
    private String fileid;

    private String expressid;

    private String exceltype;

    private String hycompany;

    private Date fhtime;

    private String ordername;

    private String address;

    private Double receivable;

    private Double received;

    private Date settledate;

    private Double servercost;

    private Date adddate;

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid == null ? null : fileid.trim();
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public String getExceltype() {
        return exceltype;
    }

    public void setExceltype(String exceltype) {
        this.exceltype = exceltype == null ? null : exceltype.trim();
    }

    public String getHycompany() {
        return hycompany;
    }

    public void setHycompany(String hycompany) {
        this.hycompany = hycompany == null ? null : hycompany.trim();
    }

    public Date getFhtime() {
        return fhtime;
    }

    public void setFhtime(Date fhtime) {
        this.fhtime = fhtime;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername == null ? null : ordername.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getReceivable() {
        return receivable;
    }

    public void setReceivable(Double receivable) {
        this.receivable = receivable;
    }

    public Double getReceived() {
        return received;
    }

    public void setReceived(Double received) {
        this.received = received;
    }

    public Date getSettledate() {
        return settledate;
    }

    public void setSettledate(Date settledate) {
        this.settledate = settledate;
    }

    public Double getServercost() {
        return servercost;
    }

    public void setServercost(Double servercost) {
        this.servercost = servercost;
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }
}