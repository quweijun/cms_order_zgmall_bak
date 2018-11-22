package com.gene.mobilemaster.model;

import java.util.Date;

public class Tb_watchlog {
    private Integer wlogid;

    private Date watchtime;

    private String clientname;

    private String mobile;

    private Integer provinces;

    private Integer acceptproject;

    private Integer acceptstyle;

    private String acceptnotes;

    private String csnotes;

    private String username;

    private String userid;

    private Integer flag;

    public Integer getWlogid() {
        return wlogid;
    }

    public void setWlogid(Integer wlogid) {
        this.wlogid = wlogid;
    }

    public Date getWatchtime() {
        return watchtime;
    }

    public void setWatchtime(Date watchtime) {
        this.watchtime = watchtime;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname == null ? null : clientname.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getProvinces() {
        return provinces;
    }

    public void setProvinces(Integer provinces) {
        this.provinces = provinces;
    }

    public Integer getAcceptproject() {
        return acceptproject;
    }

    public void setAcceptproject(Integer acceptproject) {
        this.acceptproject = acceptproject;
    }

    public Integer getAcceptstyle() {
        return acceptstyle;
    }

    public void setAcceptstyle(Integer acceptstyle) {
        this.acceptstyle = acceptstyle;
    }

    public String getAcceptnotes() {
        return acceptnotes;
    }

    public void setAcceptnotes(String acceptnotes) {
        this.acceptnotes = acceptnotes == null ? null : acceptnotes.trim();
    }

    public String getCsnotes() {
        return csnotes;
    }

    public void setCsnotes(String csnotes) {
        this.csnotes = csnotes == null ? null : csnotes.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}