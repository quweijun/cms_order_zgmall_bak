package com.gene.mobilemaster.model;

import java.util.Date;

public class Clientactive {
    private Double flowid;

    private String useragent;

    private String mos;

    private String ip;

    private String unique;

    private String activecode;

    private String channelid;

    private Date adddate;

    private Date activedate;

    private String mobile;

    private String ver;

    private String username;

    private String truth;

    private String im;

    private String sensitize;

    private String phoneAddress;

    public Double getFlowid() {
        return flowid;
    }

    public void setFlowid(Double flowid) {
        this.flowid = flowid;
    }

    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent == null ? null : useragent.trim();
    }

    public String getMos() {
        return mos;
    }

    public void setMos(String mos) {
        this.mos = mos == null ? null : mos.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getUnique() {
        return unique;
    }

    public void setUnique(String unique) {
        this.unique = unique == null ? null : unique.trim();
    }

    public String getActivecode() {
        return activecode;
    }

    public void setActivecode(String activecode) {
        this.activecode = activecode == null ? null : activecode.trim();
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public Date getActivedate() {
        return activedate;
    }

    public void setActivedate(Date activedate) {
        this.activedate = activedate;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver == null ? null : ver.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getTruth() {
        return truth;
    }

    public void setTruth(String truth) {
        this.truth = truth == null ? null : truth.trim();
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im == null ? null : im.trim();
    }

    public String getSensitize() {
        return sensitize;
    }

    public void setSensitize(String sensitize) {
        this.sensitize = sensitize == null ? null : sensitize.trim();
    }

    public String getPhoneAddress() {
        return phoneAddress;
    }

    public void setPhoneAddress(String phoneAddress) {
        this.phoneAddress = phoneAddress == null ? null : phoneAddress.trim();
    }
}