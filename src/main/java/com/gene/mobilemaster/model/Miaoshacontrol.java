package com.gene.mobilemaster.model;

import java.util.Date;

public class Miaoshacontrol {
    private Long flowid;

    private Integer holidayperiodid;

    private Integer tgid;

    private Integer customerid;

    private Integer flag;

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

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}