package com.gene.mobilemaster.model;

import java.util.Date;

public class Dh_area {
    private Integer dhid;

    private Integer dhtype;

    private String dhname;

    private Integer sort;

    private String dhcontent;

    private String dhdesc;

    private String dhurl;

    private Date addtime;

    private String addor;

    private Integer taxis;

    private Integer flag;

    public Integer getDhid() {
        return dhid;
    }

    public void setDhid(Integer dhid) {
        this.dhid = dhid;
    }

    public Integer getDhtype() {
        return dhtype;
    }

    public void setDhtype(Integer dhtype) {
        this.dhtype = dhtype;
    }

    public String getDhname() {
        return dhname;
    }

    public void setDhname(String dhname) {
        this.dhname = dhname == null ? null : dhname.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDhcontent() {
        return dhcontent;
    }

    public void setDhcontent(String dhcontent) {
        this.dhcontent = dhcontent == null ? null : dhcontent.trim();
    }

    public String getDhdesc() {
        return dhdesc;
    }

    public void setDhdesc(String dhdesc) {
        this.dhdesc = dhdesc == null ? null : dhdesc.trim();
    }

    public String getDhurl() {
        return dhurl;
    }

    public void setDhurl(String dhurl) {
        this.dhurl = dhurl == null ? null : dhurl.trim();
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

    public Integer getTaxis() {
        return taxis;
    }

    public void setTaxis(Integer taxis) {
        this.taxis = taxis;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}