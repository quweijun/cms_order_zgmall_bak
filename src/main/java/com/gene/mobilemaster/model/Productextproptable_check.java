package com.gene.mobilemaster.model;

public class Productextproptable_check {
    private Integer extpropid;

    private Integer flowno;

    private String olditemdisplayname;

    private Integer repextpropid;

    private Integer repflowno;

    private String newitemdisplayname;

    public Integer getExtpropid() {
        return extpropid;
    }

    public void setExtpropid(Integer extpropid) {
        this.extpropid = extpropid;
    }

    public Integer getFlowno() {
        return flowno;
    }

    public void setFlowno(Integer flowno) {
        this.flowno = flowno;
    }

    public String getOlditemdisplayname() {
        return olditemdisplayname;
    }

    public void setOlditemdisplayname(String olditemdisplayname) {
        this.olditemdisplayname = olditemdisplayname == null ? null : olditemdisplayname.trim();
    }

    public Integer getRepextpropid() {
        return repextpropid;
    }

    public void setRepextpropid(Integer repextpropid) {
        this.repextpropid = repextpropid;
    }

    public Integer getRepflowno() {
        return repflowno;
    }

    public void setRepflowno(Integer repflowno) {
        this.repflowno = repflowno;
    }

    public String getNewitemdisplayname() {
        return newitemdisplayname;
    }

    public void setNewitemdisplayname(String newitemdisplayname) {
        this.newitemdisplayname = newitemdisplayname == null ? null : newitemdisplayname.trim();
    }
}