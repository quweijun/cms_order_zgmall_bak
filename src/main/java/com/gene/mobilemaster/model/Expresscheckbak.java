package com.gene.mobilemaster.model;

import java.util.Date;

public class Expresscheckbak {
    private Integer id;

    private Integer companyid;

    private String expressid;

    private String ordername;

    private Double orderhk;

    private Double yshk;

    private Date reimbursement;

    private Double formalities;

    private Double servicefee;

    private Double sshk;

    private Double backamout;

    private Integer settlementflag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername == null ? null : ordername.trim();
    }

    public Double getOrderhk() {
        return orderhk;
    }

    public void setOrderhk(Double orderhk) {
        this.orderhk = orderhk;
    }

    public Double getYshk() {
        return yshk;
    }

    public void setYshk(Double yshk) {
        this.yshk = yshk;
    }

    public Date getReimbursement() {
        return reimbursement;
    }

    public void setReimbursement(Date reimbursement) {
        this.reimbursement = reimbursement;
    }

    public Double getFormalities() {
        return formalities;
    }

    public void setFormalities(Double formalities) {
        this.formalities = formalities;
    }

    public Double getServicefee() {
        return servicefee;
    }

    public void setServicefee(Double servicefee) {
        this.servicefee = servicefee;
    }

    public Double getSshk() {
        return sshk;
    }

    public void setSshk(Double sshk) {
        this.sshk = sshk;
    }

    public Double getBackamout() {
        return backamout;
    }

    public void setBackamout(Double backamout) {
        this.backamout = backamout;
    }

    public Integer getSettlementflag() {
        return settlementflag;
    }

    public void setSettlementflag(Integer settlementflag) {
        this.settlementflag = settlementflag;
    }
}