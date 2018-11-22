package com.gene.mobilemaster.model;

public class Moduleys_detail {
    private Integer pgid;

    private Integer ysid;

    private String paramname;

    private String paramvalue;

    public Integer getPgid() {
        return pgid;
    }

    public void setPgid(Integer pgid) {
        this.pgid = pgid;
    }

    public Integer getYsid() {
        return ysid;
    }

    public void setYsid(Integer ysid) {
        this.ysid = ysid;
    }

    public String getParamname() {
        return paramname;
    }

    public void setParamname(String paramname) {
        this.paramname = paramname == null ? null : paramname.trim();
    }

    public String getParamvalue() {
        return paramvalue;
    }

    public void setParamvalue(String paramvalue) {
        this.paramvalue = paramvalue == null ? null : paramvalue.trim();
    }
}