package com.gene.mobilemaster.model;

import java.util.Date;

public class Countsid {
    private Integer id;

    private Date accesstime;

    private Integer sidsum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAccesstime() {
        return accesstime;
    }

    public void setAccesstime(Date accesstime) {
        this.accesstime = accesstime;
    }

    public Integer getSidsum() {
        return sidsum;
    }

    public void setSidsum(Integer sidsum) {
        this.sidsum = sidsum;
    }
}