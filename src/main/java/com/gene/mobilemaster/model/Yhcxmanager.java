package com.gene.mobilemaster.model;

import java.util.Date;

public class Yhcxmanager {
    private Integer id;

    private String title;

    private Integer scope;

    private String applyType;

    private Integer zkyj;

    private Double zkyj1;

    private Double zkyj2;

    private Integer zkfs;

    private Double jtzk;

    private String zkdesc;

    private Date begindate;

    private Date enddate;

    private Integer flag;

    private Date addtime;

    private String addor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getScope() {
        return scope;
    }

    public void setScope(Integer scope) {
        this.scope = scope;
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType == null ? null : applyType.trim();
    }

    public Integer getZkyj() {
        return zkyj;
    }

    public void setZkyj(Integer zkyj) {
        this.zkyj = zkyj;
    }

    public Double getZkyj1() {
        return zkyj1;
    }

    public void setZkyj1(Double zkyj1) {
        this.zkyj1 = zkyj1;
    }

    public Double getZkyj2() {
        return zkyj2;
    }

    public void setZkyj2(Double zkyj2) {
        this.zkyj2 = zkyj2;
    }

    public Integer getZkfs() {
        return zkfs;
    }

    public void setZkfs(Integer zkfs) {
        this.zkfs = zkfs;
    }

    public Double getJtzk() {
        return jtzk;
    }

    public void setJtzk(Double jtzk) {
        this.jtzk = jtzk;
    }

    public String getZkdesc() {
        return zkdesc;
    }

    public void setZkdesc(String zkdesc) {
        this.zkdesc = zkdesc == null ? null : zkdesc.trim();
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
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

    public String getAddor() {
        return addor;
    }

    public void setAddor(String addor) {
        this.addor = addor == null ? null : addor.trim();
    }
}