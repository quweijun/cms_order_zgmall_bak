package com.gene.mobilemaster.model;

import java.util.Date;

public class Order_tongji {
    private Long id;

    private Integer ordercount;

    private Date starttime;

    private Date endtime;

    private Integer querencount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrdercount() {
        return ordercount;
    }

    public void setOrdercount(Integer ordercount) {
        this.ordercount = ordercount;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getQuerencount() {
        return querencount;
    }

    public void setQuerencount(Integer querencount) {
        this.querencount = querencount;
    }
}