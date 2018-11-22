package com.gene.mobilemaster.model;

import java.util.Date;

public class Link_log {
    private Long linkid;

    private Date accesstime;

    private String mobileip;

    private String mobileua;

    private String mobile;

    private String url;

    private String channelid;

    private String httpReferer;

    private Integer logflag;

    private Integer enableflag;

    public Long getLinkid() {
        return linkid;
    }

    public void setLinkid(Long linkid) {
        this.linkid = linkid;
    }

    public Date getAccesstime() {
        return accesstime;
    }

    public void setAccesstime(Date accesstime) {
        this.accesstime = accesstime;
    }

    public String getMobileip() {
        return mobileip;
    }

    public void setMobileip(String mobileip) {
        this.mobileip = mobileip == null ? null : mobileip.trim();
    }

    public String getMobileua() {
        return mobileua;
    }

    public void setMobileua(String mobileua) {
        this.mobileua = mobileua == null ? null : mobileua.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getHttpReferer() {
        return httpReferer;
    }

    public void setHttpReferer(String httpReferer) {
        this.httpReferer = httpReferer == null ? null : httpReferer.trim();
    }

    public Integer getLogflag() {
        return logflag;
    }

    public void setLogflag(Integer logflag) {
        this.logflag = logflag;
    }

    public Integer getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Integer enableflag) {
        this.enableflag = enableflag;
    }
}