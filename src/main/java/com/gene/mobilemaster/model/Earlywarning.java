package com.gene.mobilemaster.model;

public class Earlywarning {
    private Integer flowno;

    private String fieldengname;

    private String fieldchnname;

    private Double fielddefaultvalue;

    private String bz;

    private String flag;

    public Integer getFlowno() {
        return flowno;
    }

    public void setFlowno(Integer flowno) {
        this.flowno = flowno;
    }

    public String getFieldengname() {
        return fieldengname;
    }

    public void setFieldengname(String fieldengname) {
        this.fieldengname = fieldengname == null ? null : fieldengname.trim();
    }

    public String getFieldchnname() {
        return fieldchnname;
    }

    public void setFieldchnname(String fieldchnname) {
        this.fieldchnname = fieldchnname == null ? null : fieldchnname.trim();
    }

    public Double getFielddefaultvalue() {
        return fielddefaultvalue;
    }

    public void setFielddefaultvalue(Double fielddefaultvalue) {
        this.fielddefaultvalue = fielddefaultvalue;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }
}