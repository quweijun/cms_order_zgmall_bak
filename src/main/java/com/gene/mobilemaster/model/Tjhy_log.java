package com.gene.mobilemaster.model;

import java.util.Date;

public class Tjhy_log {
    private Integer id;

    private String customerid;

    private String tjmobile;

    private String content;

    private Date addtime;

    private Integer tjcounts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getTjmobile() {
        return tjmobile;
    }

    public void setTjmobile(String tjmobile) {
        this.tjmobile = tjmobile == null ? null : tjmobile.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getTjcounts() {
        return tjcounts;
    }

    public void setTjcounts(Integer tjcounts) {
        this.tjcounts = tjcounts;
    }
}