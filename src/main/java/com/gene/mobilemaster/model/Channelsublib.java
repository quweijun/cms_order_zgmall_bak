package com.gene.mobilemaster.model;

public class Channelsublib {
    private Integer flowid;

    private String channelid;

    private String subchannelid;

    public Integer getFlowid() {
        return flowid;
    }

    public void setFlowid(Integer flowid) {
        this.flowid = flowid;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getSubchannelid() {
        return subchannelid;
    }

    public void setSubchannelid(String subchannelid) {
        this.subchannelid = subchannelid == null ? null : subchannelid.trim();
    }
}