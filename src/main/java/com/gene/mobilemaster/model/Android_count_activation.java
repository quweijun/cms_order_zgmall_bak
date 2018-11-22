package com.gene.mobilemaster.model;

public class Android_count_activation {
    private Integer flowid;

    private String channelid;

    private String uniqueid;

    private String yeardate;

    private String monthdate;

    private Integer operacount;

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

    public String getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid == null ? null : uniqueid.trim();
    }

    public String getYeardate() {
        return yeardate;
    }

    public void setYeardate(String yeardate) {
        this.yeardate = yeardate == null ? null : yeardate.trim();
    }

    public String getMonthdate() {
        return monthdate;
    }

    public void setMonthdate(String monthdate) {
        this.monthdate = monthdate == null ? null : monthdate.trim();
    }

    public Integer getOperacount() {
        return operacount;
    }

    public void setOperacount(Integer operacount) {
        this.operacount = operacount;
    }
}