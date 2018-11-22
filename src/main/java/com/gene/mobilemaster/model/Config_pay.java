package com.gene.mobilemaster.model;

import java.util.Date;

public class Config_pay {
    private Double alipayPercent;

    private Double mybursePercent;

    private Double dingjinPercent;

    private Double kdfhPercent;

    private Double dinjingMin;

    private Date addtime;

    private Integer flag;

    private Integer configid;

    public Double getAlipayPercent() {
        return alipayPercent;
    }

    public void setAlipayPercent(Double alipayPercent) {
        this.alipayPercent = alipayPercent;
    }

    public Double getMybursePercent() {
        return mybursePercent;
    }

    public void setMybursePercent(Double mybursePercent) {
        this.mybursePercent = mybursePercent;
    }

    public Double getDingjinPercent() {
        return dingjinPercent;
    }

    public void setDingjinPercent(Double dingjinPercent) {
        this.dingjinPercent = dingjinPercent;
    }

    public Double getKdfhPercent() {
        return kdfhPercent;
    }

    public void setKdfhPercent(Double kdfhPercent) {
        this.kdfhPercent = kdfhPercent;
    }

    public Double getDinjingMin() {
        return dinjingMin;
    }

    public void setDinjingMin(Double dinjingMin) {
        this.dinjingMin = dinjingMin;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getConfigid() {
        return configid;
    }

    public void setConfigid(Integer configid) {
        this.configid = configid;
    }
}