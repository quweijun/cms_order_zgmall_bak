package com.gene.mobilemaster.model;

public class Extpropcheck {
    private String extpropfullname;

    private Integer extpropid;

    private Integer itemcount;

    private Integer flag;

    private Integer repextpropid;

    private Integer prodcount;

    public String getExtpropfullname() {
        return extpropfullname;
    }

    public void setExtpropfullname(String extpropfullname) {
        this.extpropfullname = extpropfullname == null ? null : extpropfullname.trim();
    }

    public Integer getExtpropid() {
        return extpropid;
    }

    public void setExtpropid(Integer extpropid) {
        this.extpropid = extpropid;
    }

    public Integer getItemcount() {
        return itemcount;
    }

    public void setItemcount(Integer itemcount) {
        this.itemcount = itemcount;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getRepextpropid() {
        return repextpropid;
    }

    public void setRepextpropid(Integer repextpropid) {
        this.repextpropid = repextpropid;
    }

    public Integer getProdcount() {
        return prodcount;
    }

    public void setProdcount(Integer prodcount) {
        this.prodcount = prodcount;
    }
}