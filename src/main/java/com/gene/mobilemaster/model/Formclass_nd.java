package com.gene.mobilemaster.model;

import java.util.Date;

public class Formclass_nd {
    private Integer flowid;

    private Integer classid;

    private Integer typeid;

    private String classname;

    private String saveastable;

    private Integer islog;

    private Integer ispingjia;

    private Integer isreply;

    private Integer iszixun;

    private Date addtime;

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

    public Integer getIslog() {
        return islog;
    }

    public void setIslog(Integer islog) {
        this.islog = islog;
    }

    public Integer getIspingjia() {
        return ispingjia;
    }

    public void setIspingjia(Integer ispingjia) {
        this.ispingjia = ispingjia;
    }

    public Integer getIsreply() {
        return isreply;
    }

    public void setIsreply(Integer isreply) {
        this.isreply = isreply;
    }

    public Integer getIszixun() {
        return iszixun;
    }

    public void setIszixun(Integer iszixun) {
        this.iszixun = iszixun;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
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