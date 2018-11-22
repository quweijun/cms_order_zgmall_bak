package com.gene.mobilemaster.model;

import java.util.Date;

public class Smsinfo_history {
    private Integer flowno;

    private String mobile;

    private String smsdirect;

    private String smscontent;

    private Date smsproctime;

    private String orderid;

    private String smsdate;

    private String smscode;

    public Integer getFlowno() {
        return flowno;
    }

    public void setFlowno(Integer flowno) {
        this.flowno = flowno;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getSmsdirect() {
        return smsdirect;
    }

    public void setSmsdirect(String smsdirect) {
        this.smsdirect = smsdirect == null ? null : smsdirect.trim();
    }

    public String getSmscontent() {
        return smscontent;
    }

    public void setSmscontent(String smscontent) {
        this.smscontent = smscontent == null ? null : smscontent.trim();
    }

    public Date getSmsproctime() {
        return smsproctime;
    }

    public void setSmsproctime(Date smsproctime) {
        this.smsproctime = smsproctime;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getSmsdate() {
        return smsdate;
    }

    public void setSmsdate(String smsdate) {
        this.smsdate = smsdate == null ? null : smsdate.trim();
    }

    public String getSmscode() {
        return smscode;
    }

    public void setSmscode(String smscode) {
        this.smscode = smscode == null ? null : smscode.trim();
    }
}