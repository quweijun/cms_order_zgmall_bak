package com.gene.mobilemaster.model;

import java.util.Date;

public class Page_area_20141104 {
    private Integer pageid;

    private Integer sort;

    private Integer subchannel;

    private String title;

    private String pageurl;

    private Date addtime;

    private String addor;

    private Integer flag;

    private Integer taxis;

    private String ubbcontent;

    public Integer getPageid() {
        return pageid;
    }

    public void setPageid(Integer pageid) {
        this.pageid = pageid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSubchannel() {
        return subchannel;
    }

    public void setSubchannel(Integer subchannel) {
        this.subchannel = subchannel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPageurl() {
        return pageurl;
    }

    public void setPageurl(String pageurl) {
        this.pageurl = pageurl == null ? null : pageurl.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getAddor() {
        return addor;
    }

    public void setAddor(String addor) {
        this.addor = addor == null ? null : addor.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getTaxis() {
        return taxis;
    }

    public void setTaxis(Integer taxis) {
        this.taxis = taxis;
    }

    public String getUbbcontent() {
        return ubbcontent;
    }

    public void setUbbcontent(String ubbcontent) {
        this.ubbcontent = ubbcontent == null ? null : ubbcontent.trim();
    }
}