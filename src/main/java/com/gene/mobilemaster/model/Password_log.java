package com.gene.mobilemaster.model;

import java.util.Date;

public class Password_log {
    private Long flowid;

    private String customerid;

    private String enterpassword;

    private String password;

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

    public String getEnterpassword() {
        return enterpassword;
    }

    public void setEnterpassword(String enterpassword) {
        this.enterpassword = enterpassword == null ? null : enterpassword.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}