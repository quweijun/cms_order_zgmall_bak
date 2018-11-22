package com.gene.mobilemaster.model;

import java.util.Date;

public class Zguserinfo_log {
    private Integer userid;

    private String username;

    private String ip;

    private String useragent;

    private Date logintime;

    private Integer loginok;

    private String ipsheng;

    private String ipshi;

    private String ipnetwork;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent == null ? null : useragent.trim();
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public Integer getLoginok() {
        return loginok;
    }

    public void setLoginok(Integer loginok) {
        this.loginok = loginok;
    }

    public String getIpsheng() {
        return ipsheng;
    }

    public void setIpsheng(String ipsheng) {
        this.ipsheng = ipsheng == null ? null : ipsheng.trim();
    }

    public String getIpshi() {
        return ipshi;
    }

    public void setIpshi(String ipshi) {
        this.ipshi = ipshi == null ? null : ipshi.trim();
    }

    public String getIpnetwork() {
        return ipnetwork;
    }

    public void setIpnetwork(String ipnetwork) {
        this.ipnetwork = ipnetwork == null ? null : ipnetwork.trim();
    }
}