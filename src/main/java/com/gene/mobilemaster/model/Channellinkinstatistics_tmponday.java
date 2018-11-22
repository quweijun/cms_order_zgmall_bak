package com.gene.mobilemaster.model;

import java.util.Date;

public class Channellinkinstatistics_tmponday {
    private Long flowno;

    private Date linkindate;

    private Integer linkincountpv;

    private String channelid;

    private String linkinurl;

    private String linkinurlparam;

    public Long getFlowno() {
        return flowno;
    }

    public void setFlowno(Long flowno) {
        this.flowno = flowno;
    }

    public Date getLinkindate() {
        return linkindate;
    }

    public void setLinkindate(Date linkindate) {
        this.linkindate = linkindate;
    }

    public Integer getLinkincountpv() {
        return linkincountpv;
    }

    public void setLinkincountpv(Integer linkincountpv) {
        this.linkincountpv = linkincountpv;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getLinkinurl() {
        return linkinurl;
    }

    public void setLinkinurl(String linkinurl) {
        this.linkinurl = linkinurl == null ? null : linkinurl.trim();
    }

    public String getLinkinurlparam() {
        return linkinurlparam;
    }

    public void setLinkinurlparam(String linkinurlparam) {
        this.linkinurlparam = linkinurlparam == null ? null : linkinurlparam.trim();
    }
}