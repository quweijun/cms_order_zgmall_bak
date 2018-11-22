package com.gene.mobilemaster.model;

import java.util.Date;

public class Actionclass_nd {
    private Integer flowid;

    private Integer classid;

    private Integer typeid;

    private String classname;

    private String saveastable;

    private Date addtime;

    private String images;

    private String bzdesc;

    private Integer flag;

    private Integer xh;

    public Integer getFlowid() {
        return flowid;
    }

    public void setFlowid(Integer flowid) {
        this.flowid = flowid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getSaveastable() {
        return saveastable;
    }

    public void setSaveastable(String saveastable) {
        this.saveastable = saveastable == null ? null : saveastable.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getBzdesc() {
        return bzdesc;
    }

    public void setBzdesc(String bzdesc) {
        this.bzdesc = bzdesc == null ? null : bzdesc.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }
}