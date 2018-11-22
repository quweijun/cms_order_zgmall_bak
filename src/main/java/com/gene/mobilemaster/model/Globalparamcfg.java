package com.gene.mobilemaster.model;

public class Globalparamcfg {
    private Integer flowno;

    private String paramengname;

    private String paramchnname;

    private Double paramdefaultvalue;

    private String bz;

    private String flag;

    public Integer getFlowno() {
        return flowno;
    }

    public void setFlowno(Integer flowno) {
        this.flowno = flowno;
    }

    public String getParamengname() {
        return paramengname;
    }

    public void setParamengname(String paramengname) {
        this.paramengname = paramengname == null ? null : paramengname.trim();
    }

    public String getParamchnname() {
        return paramchnname;
    }

    public void setParamchnname(String paramchnname) {
        this.paramchnname = paramchnname == null ? null : paramchnname.trim();
    }

    public Double getParamdefaultvalue() {
        return paramdefaultvalue;
    }

    public void setParamdefaultvalue(Double paramdefaultvalue) {
        this.paramdefaultvalue = paramdefaultvalue;
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