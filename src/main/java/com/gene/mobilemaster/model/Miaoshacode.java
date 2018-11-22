package com.gene.mobilemaster.model;

import java.util.Date;

public class Miaoshacode {
    private Long flowid;

    private Integer holidayperiodid;

    private Integer customerid;

    private Integer mscode;

    private Date addtime;

    private String url;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public Integer getHolidayperiodid() {
        return holidayperiodid;
    }

    public void setHolidayperiodid(Integer holidayperiodid) {
        this.holidayperiodid = holidayperiodid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getMscode() {
        return mscode;
    }

    public void setMscode(Integer mscode) {
        this.mscode = mscode;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}