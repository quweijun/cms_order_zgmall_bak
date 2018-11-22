package com.gene.mobilemaster.model;

import java.util.Date;

public class Msconfigurationtable {
    private Long flowid;

    private Integer holidayperiodid;

    private Integer tgid;

    private String buytimelimit;

    private Integer customerclass;

    private Integer weixin;

    private Integer qianshou;

    private Date addtime;

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

    public Integer getTgid() {
        return tgid;
    }

    public void setTgid(Integer tgid) {
        this.tgid = tgid;
    }

    public String getBuytimelimit() {
        return buytimelimit;
    }

    public void setBuytimelimit(String buytimelimit) {
        this.buytimelimit = buytimelimit == null ? null : buytimelimit.trim();
    }

    public Integer getCustomerclass() {
        return customerclass;
    }

    public void setCustomerclass(Integer customerclass) {
        this.customerclass = customerclass;
    }

    public Integer getWeixin() {
        return weixin;
    }

    public void setWeixin(Integer weixin) {
        this.weixin = weixin;
    }

    public Integer getQianshou() {
        return qianshou;
    }

    public void setQianshou(Integer qianshou) {
        this.qianshou = qianshou;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}