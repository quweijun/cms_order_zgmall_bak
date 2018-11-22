package com.gene.mobilemaster.model;

import java.util.Date;

public class Jifentojiangpin_bak {
    private Long flowid;

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

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
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
}