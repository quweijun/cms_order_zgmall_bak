package com.gene.mobilemaster.model;

public class Productextpropitemdict {
    private Integer flowno;

    private Integer extpropid;

    private String itemid;

    private String itemdisplayname;

    private String itemremark;

    private Integer itemorder;

    private String isvalid;

    public Integer getFlowno() {
        return flowno;
    }

    public void setFlowno(Integer flowno) {
        this.flowno = flowno;
    }

    public Integer getExtpropid() {
        return extpropid;
    }

    public void setExtpropid(Integer extpropid) {
        this.extpropid = extpropid;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getItemdisplayname() {
        return itemdisplayname;
    }

    public void setItemdisplayname(String itemdisplayname) {
        this.itemdisplayname = itemdisplayname == null ? null : itemdisplayname.trim();
    }

    public String getItemremark() {
        return itemremark;
    }

    public void setItemremark(String itemremark) {
        this.itemremark = itemremark == null ? null : itemremark.trim();
    }

    public Integer getItemorder() {
        return itemorder;
    }

    public void setItemorder(Integer itemorder) {
        this.itemorder = itemorder;
    }

    public String getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(String isvalid) {
        this.isvalid = isvalid == null ? null : isvalid.trim();
    }
}