package com.gene.mobilemaster.model;

import java.util.Date;

public class Jxtable {
    private Long channelid;

    private Integer jxid;

    private String url;

    private Date accesstime;

    public Long getChannelid() {
        return channelid;
    }

    public void setChannelid(Long channelid) {
        this.channelid = channelid;
    }

    public Integer getJxid() {
        return jxid;
    }

    public void setJxid(Integer jxid) {
        this.jxid = jxid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getAccesstime() {
        return accesstime;
    }

    public void setAccesstime(Date accesstime) {
        this.accesstime = accesstime;
    }
}