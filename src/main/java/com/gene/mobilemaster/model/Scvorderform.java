package com.gene.mobilemaster.model;

import java.util.Date;

public class Scvorderform {
    private String flowid;

    private String bussinessid;

    private String channelid;

    private String registerflowno;

    private Date submitdate;

    private String bussinessprice;

    private String orderflag;

    private String flag;

    private String flag2;

    private String tcprice;

    public String getFlowid() {
        return flowid;
    }

    public void setFlowid(String flowid) {
        this.flowid = flowid == null ? null : flowid.trim();
    }

    public String getBussinessid() {
        return bussinessid;
    }

    public void setBussinessid(String bussinessid) {
        this.bussinessid = bussinessid == null ? null : bussinessid.trim();
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getRegisterflowno() {
        return registerflowno;
    }

    public void setRegisterflowno(String registerflowno) {
        this.registerflowno = registerflowno == null ? null : registerflowno.trim();
    }

    public Date getSubmitdate() {
        return submitdate;
    }

    public void setSubmitdate(Date submitdate) {
        this.submitdate = submitdate;
    }

    public String getBussinessprice() {
        return bussinessprice;
    }

    public void setBussinessprice(String bussinessprice) {
        this.bussinessprice = bussinessprice == null ? null : bussinessprice.trim();
    }

    public String getOrderflag() {
        return orderflag;
    }

    public void setOrderflag(String orderflag) {
        this.orderflag = orderflag == null ? null : orderflag.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getFlag2() {
        return flag2;
    }

    public void setFlag2(String flag2) {
        this.flag2 = flag2 == null ? null : flag2.trim();
    }

    public String getTcprice() {
        return tcprice;
    }

    public void setTcprice(String tcprice) {
        this.tcprice = tcprice == null ? null : tcprice.trim();
    }
}