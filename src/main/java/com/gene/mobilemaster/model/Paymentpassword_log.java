package com.gene.mobilemaster.model;

import java.util.Date;

public class Paymentpassword_log {
    private Long flowid;

    private String customerid;

    private String mobile;

    private String enterpassword;

    private String paymentpassword;

    private Date addtime;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEnterpassword() {
        return enterpassword;
    }

    public void setEnterpassword(String enterpassword) {
        this.enterpassword = enterpassword == null ? null : enterpassword.trim();
    }

    public String getPaymentpassword() {
        return paymentpassword;
    }

    public void setPaymentpassword(String paymentpassword) {
        this.paymentpassword = paymentpassword == null ? null : paymentpassword.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}