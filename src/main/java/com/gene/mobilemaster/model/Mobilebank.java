package com.gene.mobilemaster.model;

public class Mobilebank {
    private Long mobileBankId;

    private String idcardname;

    private String idcardno;

    private String bankaddress;

    private String idcardtype;

    private String username;

    private String idcardaddress;

    private String bankphonenumber;

    private String mobile;

    private String bankcardno;

    private String mobileBank;

    private String orderid;

    public Long getMobileBankId() {
        return mobileBankId;
    }

    public void setMobileBankId(Long mobileBankId) {
        this.mobileBankId = mobileBankId;
    }

    public String getIdcardname() {
        return idcardname;
    }

    public void setIdcardname(String idcardname) {
        this.idcardname = idcardname == null ? null : idcardname.trim();
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno == null ? null : idcardno.trim();
    }

    public String getBankaddress() {
        return bankaddress;
    }

    public void setBankaddress(String bankaddress) {
        this.bankaddress = bankaddress == null ? null : bankaddress.trim();
    }

    public String getIdcardtype() {
        return idcardtype;
    }

    public void setIdcardtype(String idcardtype) {
        this.idcardtype = idcardtype == null ? null : idcardtype.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getIdcardaddress() {
        return idcardaddress;
    }

    public void setIdcardaddress(String idcardaddress) {
        this.idcardaddress = idcardaddress == null ? null : idcardaddress.trim();
    }

    public String getBankphonenumber() {
        return bankphonenumber;
    }

    public void setBankphonenumber(String bankphonenumber) {
        this.bankphonenumber = bankphonenumber == null ? null : bankphonenumber.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getBankcardno() {
        return bankcardno;
    }

    public void setBankcardno(String bankcardno) {
        this.bankcardno = bankcardno == null ? null : bankcardno.trim();
    }

    public String getMobileBank() {
        return mobileBank;
    }

    public void setMobileBank(String mobileBank) {
        this.mobileBank = mobileBank == null ? null : mobileBank.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }
}