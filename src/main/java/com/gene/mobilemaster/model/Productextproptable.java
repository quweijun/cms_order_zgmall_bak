package com.gene.mobilemaster.model;

public class Productextproptable {
    private String productid;

    private Integer extpropid;

    private String extpropvalue;

    private String extproptruevalue;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

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

    public String getExtproptruevalue() {
        return extproptruevalue;
    }

    public void setExtproptruevalue(String extproptruevalue) {
        this.extproptruevalue = extproptruevalue == null ? null : extproptruevalue.trim();
    }
}