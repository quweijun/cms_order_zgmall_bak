package com.gene.mobilemaster.model;

public class Tranprovider {
    private Integer provideid;

    private String providename;

    private String accountround;

    private String openbank;

    private String openperson;

    private String openaccountno;

    private String daiflag;

    private String phone;

    private Integer pxId;

    private String provideflag;

    private String excompanycode;

    public Integer getProvideid() {
        return provideid;
    }

    public void setProvideid(Integer provideid) {
        this.provideid = provideid;
    }

    public String getProvidename() {
        return providename;
    }

    public void setProvidename(String providename) {
        this.providename = providename == null ? null : providename.trim();
    }

    public String getAccountround() {
        return accountround;
    }

    public void setAccountround(String accountround) {
        this.accountround = accountround == null ? null : accountround.trim();
    }

    public String getOpenbank() {
        return openbank;
    }

    public void setOpenbank(String openbank) {
        this.openbank = openbank == null ? null : openbank.trim();
    }

    public String getOpenperson() {
        return openperson;
    }

    public void setOpenperson(String openperson) {
        this.openperson = openperson == null ? null : openperson.trim();
    }

    public String getOpenaccountno() {
        return openaccountno;
    }

    public void setOpenaccountno(String openaccountno) {
        this.openaccountno = openaccountno == null ? null : openaccountno.trim();
    }

    public String getDaiflag() {
        return daiflag;
    }

    public void setDaiflag(String daiflag) {
        this.daiflag = daiflag == null ? null : daiflag.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getPxId() {
        return pxId;
    }

    public void setPxId(Integer pxId) {
        this.pxId = pxId;
    }

    public String getProvideflag() {
        return provideflag;
    }

    public void setProvideflag(String provideflag) {
        this.provideflag = provideflag == null ? null : provideflag.trim();
    }

    public String getExcompanycode() {
        return excompanycode;
    }

    public void setExcompanycode(String excompanycode) {
        this.excompanycode = excompanycode == null ? null : excompanycode.trim();
    }
}