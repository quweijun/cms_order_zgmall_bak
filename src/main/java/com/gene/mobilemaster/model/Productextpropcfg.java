package com.gene.mobilemaster.model;

public class Productextpropcfg {
    private Integer extpropid;

    private String inputtype;

    private String extpropenname;

    private String extpropdisplayname;

    private String extpropfullname;

    private String extpropremark;

    private String valuetype;

    private Integer valuelength;

    private String defaultvalue;

    private String isrequired;

    private String isshow;

    private String isquery;

    private Integer orders;

    private String isvalid;

    private Integer bjflag;

    public Integer getExtpropid() {
        return extpropid;
    }

    public void setExtpropid(Integer extpropid) {
        this.extpropid = extpropid;
    }

    public String getInputtype() {
        return inputtype;
    }

    public void setInputtype(String inputtype) {
        this.inputtype = inputtype == null ? null : inputtype.trim();
    }

    public String getExtpropenname() {
        return extpropenname;
    }

    public void setExtpropenname(String extpropenname) {
        this.extpropenname = extpropenname == null ? null : extpropenname.trim();
    }

    public String getExtpropdisplayname() {
        return extpropdisplayname;
    }

    public void setExtpropdisplayname(String extpropdisplayname) {
        this.extpropdisplayname = extpropdisplayname == null ? null : extpropdisplayname.trim();
    }

    public String getExtpropfullname() {
        return extpropfullname;
    }

    public void setExtpropfullname(String extpropfullname) {
        this.extpropfullname = extpropfullname == null ? null : extpropfullname.trim();
    }

    public String getExtpropremark() {
        return extpropremark;
    }

    public void setExtpropremark(String extpropremark) {
        this.extpropremark = extpropremark == null ? null : extpropremark.trim();
    }

    public String getValuetype() {
        return valuetype;
    }

    public void setValuetype(String valuetype) {
        this.valuetype = valuetype == null ? null : valuetype.trim();
    }

    public Integer getValuelength() {
        return valuelength;
    }

    public void setValuelength(Integer valuelength) {
        this.valuelength = valuelength;
    }

    public String getDefaultvalue() {
        return defaultvalue;
    }

    public void setDefaultvalue(String defaultvalue) {
        this.defaultvalue = defaultvalue == null ? null : defaultvalue.trim();
    }

    public String getIsrequired() {
        return isrequired;
    }

    public void setIsrequired(String isrequired) {
        this.isrequired = isrequired == null ? null : isrequired.trim();
    }

    public String getIsshow() {
        return isshow;
    }

    public void setIsshow(String isshow) {
        this.isshow = isshow == null ? null : isshow.trim();
    }

    public String getIsquery() {
        return isquery;
    }

    public void setIsquery(String isquery) {
        this.isquery = isquery == null ? null : isquery.trim();
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public String getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(String isvalid) {
        this.isvalid = isvalid == null ? null : isvalid.trim();
    }

    public Integer getBjflag() {
        return bjflag;
    }

    public void setBjflag(Integer bjflag) {
        this.bjflag = bjflag;
    }
}