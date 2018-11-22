package com.gene.mobilemaster.model;

import java.util.Date;

public class Channelinfopermonth {
    private Integer flowid;

    private String channelid;

    private Integer year;

    private Integer month;

    private Integer rksum;

    private Integer pvsum;

    private Integer yhsum;

    private Integer ordersum;

    private Integer sureorder;

    private Integer doneorder;

    private Integer backorder;

    private Integer serviceorder;

    private Integer repealorder;

    private Double orderrate;

    private Double surerate;

    private Double repealrate;

    private Double donerate;

    private Double backrate;

    private Double servicerate;

    private Date addtime;

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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getRksum() {
        return rksum;
    }

    public void setRksum(Integer rksum) {
        this.rksum = rksum;
    }

    public Integer getPvsum() {
        return pvsum;
    }

    public void setPvsum(Integer pvsum) {
        this.pvsum = pvsum;
    }

    public Integer getYhsum() {
        return yhsum;
    }

    public void setYhsum(Integer yhsum) {
        this.yhsum = yhsum;
    }

    public Integer getOrdersum() {
        return ordersum;
    }

    public void setOrdersum(Integer ordersum) {
        this.ordersum = ordersum;
    }

    public Integer getSureorder() {
        return sureorder;
    }

    public void setSureorder(Integer sureorder) {
        this.sureorder = sureorder;
    }

    public Integer getDoneorder() {
        return doneorder;
    }

    public void setDoneorder(Integer doneorder) {
        this.doneorder = doneorder;
    }

    public Integer getBackorder() {
        return backorder;
    }

    public void setBackorder(Integer backorder) {
        this.backorder = backorder;
    }

    public Integer getServiceorder() {
        return serviceorder;
    }

    public void setServiceorder(Integer serviceorder) {
        this.serviceorder = serviceorder;
    }

    public Integer getRepealorder() {
        return repealorder;
    }

    public void setRepealorder(Integer repealorder) {
        this.repealorder = repealorder;
    }

    public Double getOrderrate() {
        return orderrate;
    }

    public void setOrderrate(Double orderrate) {
        this.orderrate = orderrate;
    }

    public Double getSurerate() {
        return surerate;
    }

    public void setSurerate(Double surerate) {
        this.surerate = surerate;
    }

    public Double getRepealrate() {
        return repealrate;
    }

    public void setRepealrate(Double repealrate) {
        this.repealrate = repealrate;
    }

    public Double getDonerate() {
        return donerate;
    }

    public void setDonerate(Double donerate) {
        this.donerate = donerate;
    }

    public Double getBackrate() {
        return backrate;
    }

    public void setBackrate(Double backrate) {
        this.backrate = backrate;
    }

    public Double getServicerate() {
        return servicerate;
    }

    public void setServicerate(Double servicerate) {
        this.servicerate = servicerate;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}