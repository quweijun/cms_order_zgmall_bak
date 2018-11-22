package com.gene.mobilemaster.model;

import java.util.Date;

public class Android_index_title {
    private Integer relationid;

    private Integer modalid;

    private Integer hdid;

    private String hdtitle;

    private Integer xh;

    private Integer flag;

    private String adduser;

    private Date addtime;

    public Integer getRelationid() {
        return relationid;
    }

    public void setRelationid(Integer relationid) {
        this.relationid = relationid;
    }

    public Integer getModalid() {
        return modalid;
    }

    public void setModalid(Integer modalid) {
        this.modalid = modalid;
    }

    public Integer getHdid() {
        return hdid;
    }

    public void setHdid(Integer hdid) {
        this.hdid = hdid;
    }

    public String getHdtitle() {
        return hdtitle;
    }

    public void setHdtitle(String hdtitle) {
        this.hdtitle = hdtitle == null ? null : hdtitle.trim();
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getAdduser() {
        return adduser;
    }

    public void setAdduser(String adduser) {
        this.adduser = adduser == null ? null : adduser.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}