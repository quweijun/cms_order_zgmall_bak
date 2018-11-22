package com.gene.mobilemaster.model;

import java.util.Date;

public class Customermybank {
    private Integer bankid;

    private Integer mainflag;

    private Integer customerid;

    private String orderphone;

    private String bankname;

    private String subbranchname;

    private String accountno;

    private String accountname;

    private Date addtime;

    public Integer getBankid() {
        return bankid;
    }

    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }

    public Integer getMainflag() {
        return mainflag;
    }

    public void setMainflag(Integer mainflag) {
        this.mainflag = mainflag;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getOrderphone() {
        return orderphone;
    }

    public void setOrderphone(String orderphone) {
        this.orderphone = orderphone == null ? null : orderphone.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getSubbranchname() {
        return subbranchname;
    }

    public void setSubbranchname(String subbranchname) {
        this.subbranchname = subbranchname == null ? null : subbranchname.trim();
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno == null ? null : accountno.trim();
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}