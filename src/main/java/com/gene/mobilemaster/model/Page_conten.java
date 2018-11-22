package com.gene.mobilemaster.model;

import java.util.Date;

public class Page_conten {
    private Integer id;

    private Integer pageid;

    private String listid;

    private String title;

    private Integer listtype;

    private String listurl;

    private String otherpict;

    private Integer photoflag;

    private Integer flag;

    private Integer taxis;

    private Date addtime;

    private String addor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPageid() {
        return pageid;
    }

    public void setPageid(Integer pageid) {
        this.pageid = pageid;
    }

    public String getListid() {
        return listid;
    }

    public void setListid(String listid) {
        this.listid = listid == null ? null : listid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getListtype() {
        return listtype;
    }

    public void setListtype(Integer listtype) {
        this.listtype = listtype;
    }

    public String getListurl() {
        return listurl;
    }

    public void setListurl(String listurl) {
        this.listurl = listurl == null ? null : listurl.trim();
    }

    public String getOtherpict() {
        return otherpict;
    }

    public void setOtherpict(String otherpict) {
        this.otherpict = otherpict == null ? null : otherpict.trim();
    }

    public Integer getPhotoflag() {
        return photoflag;
    }

    public void setPhotoflag(Integer photoflag) {
        this.photoflag = photoflag;
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
}