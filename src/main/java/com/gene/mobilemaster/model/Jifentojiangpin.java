package com.gene.mobilemaster.model;

import java.util.Date;

public class Jifentojiangpin {
    private Long flowid;

    private String orderid;

    private Long wapspaceid;

    private Long jiangpinid;

    private Date applydate;

    private Date reachdate;

    private String applystate;

    private String truename;

    private String address;

    private String postno;

    private String mobile;

    private String kuaidino;

    private String operator;

    private String remarks;

    private Date jppostdate;

    private Integer applystates;

    private String username;

    private Date applydates;

    private String checkusername;

    private Date checkdate;

    private String postusername;

    private Date postdate;

    private String cancelusername;

    private Date canceldate;

    private String cancelreason;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Long getWapspaceid() {
        return wapspaceid;
    }

    public void setWapspaceid(Long wapspaceid) {
        this.wapspaceid = wapspaceid;
    }

    public Long getJiangpinid() {
        return jiangpinid;
    }

    public void setJiangpinid(Long jiangpinid) {
        this.jiangpinid = jiangpinid;
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public Date getReachdate() {
        return reachdate;
    }

    public void setReachdate(Date reachdate) {
        this.reachdate = reachdate;
    }

    public String getApplystate() {
        return applystate;
    }

    public void setApplystate(String applystate) {
        this.applystate = applystate == null ? null : applystate.trim();
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename == null ? null : truename.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostno() {
        return postno;
    }

    public void setPostno(String postno) {
        this.postno = postno == null ? null : postno.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getKuaidino() {
        return kuaidino;
    }

    public void setKuaidino(String kuaidino) {
        this.kuaidino = kuaidino == null ? null : kuaidino.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getJppostdate() {
        return jppostdate;
    }

    public void setJppostdate(Date jppostdate) {
        this.jppostdate = jppostdate;
    }

    public Integer getApplystates() {
        return applystates;
    }

    public void setApplystates(Integer applystates) {
        this.applystates = applystates;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getApplydates() {
        return applydates;
    }

    public void setApplydates(Date applydates) {
        this.applydates = applydates;
    }

    public String getCheckusername() {
        return checkusername;
    }

    public void setCheckusername(String checkusername) {
        this.checkusername = checkusername == null ? null : checkusername.trim();
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public String getPostusername() {
        return postusername;
    }

    public void setPostusername(String postusername) {
        this.postusername = postusername == null ? null : postusername.trim();
    }

    public Date getPostdate() {
        return postdate;
    }

    public void setPostdate(Date postdate) {
        this.postdate = postdate;
    }

    public String getCancelusername() {
        return cancelusername;
    }

    public void setCancelusername(String cancelusername) {
        this.cancelusername = cancelusername == null ? null : cancelusername.trim();
    }

    public Date getCanceldate() {
        return canceldate;
    }

    public void setCanceldate(Date canceldate) {
        this.canceldate = canceldate;
    }

    public String getCancelreason() {
        return cancelreason;
    }

    public void setCancelreason(String cancelreason) {
        this.cancelreason = cancelreason == null ? null : cancelreason.trim();
    }
}