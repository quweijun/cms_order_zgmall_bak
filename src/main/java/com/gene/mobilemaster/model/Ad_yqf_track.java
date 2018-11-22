package com.gene.mobilemaster.model;

import java.util.Date;

public class Ad_yqf_track {
    private Long flowno;

    private String src;

    private String channel;

    private String cid;

    private String wi;

    private Long zgcid;

    private Date addtime;

    public Long getFlowno() {
        return flowno;
    }

    public void setFlowno(Long flowno) {
        this.flowno = flowno;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src == null ? null : src.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getWi() {
        return wi;
    }

    public void setWi(String wi) {
        this.wi = wi == null ? null : wi.trim();
    }

    public Long getZgcid() {
        return zgcid;
    }

    public void setZgcid(Long zgcid) {
        this.zgcid = zgcid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}