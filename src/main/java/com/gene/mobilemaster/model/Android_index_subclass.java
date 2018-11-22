package com.gene.mobilemaster.model;

import java.util.Date;

public class Android_index_subclass {
    private Integer relationid;

    private Integer modalid;

    private Integer typeid;

    private String typename;

    private Integer xh;

    private Integer flag;

    private String adduser;

    private Date addtime;

    private String typerank;

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

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
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

    public String getTyperank() {
        return typerank;
    }

    public void setTyperank(String typerank) {
        this.typerank = typerank == null ? null : typerank.trim();
    }
}