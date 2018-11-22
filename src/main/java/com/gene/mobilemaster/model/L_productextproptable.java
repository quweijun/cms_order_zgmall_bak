package com.gene.mobilemaster.model;

public class L_productextproptable {
    private Integer extpropid;

    private String extpropvalue;

    private String lProductid;

    private String extproptruevalue;

    public Integer getExtpropid() {
        return extpropid;
    }

    public void setExtpropid(Integer extpropid) {
        this.extpropid = extpropid;
    }

    public String getExtpropvalue() {
        return extpropvalue;
    }

    public void setExtpropvalue(String extpropvalue) {
        this.extpropvalue = extpropvalue == null ? null : extpropvalue.trim();
    }

    public String getlProductid() {
        return lProductid;
    }

    public void setlProductid(String lProductid) {
        this.lProductid = lProductid == null ? null : lProductid.trim();
    }

    public String getExtproptruevalue() {
        return extproptruevalue;
    }

    public void setExtproptruevalue(String extproptruevalue) {
        this.extproptruevalue = extproptruevalue == null ? null : extproptruevalue.trim();
    }
}