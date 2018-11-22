package com.gene.mobilemaster.model;

public class Modulebqmapfunparam {
    private Integer flowid;

    private String bqlb;

    private String ywlx;

    private Integer paramxh;

    private String paramname;

    private String paramchnname;

    private String paramtype;

    private String datalisttype;

    private String datalistvalue;

    private String defaultvalue;

    private String readonly;

    private String searchurl;

    public Integer getFlowid() {
        return flowid;
    }

    public void setFlowid(Integer flowid) {
        this.flowid = flowid;
    }

    public String getBqlb() {
        return bqlb;
    }

    public void setBqlb(String bqlb) {
        this.bqlb = bqlb == null ? null : bqlb.trim();
    }

    public String getYwlx() {
        return ywlx;
    }

    public void setYwlx(String ywlx) {
        this.ywlx = ywlx == null ? null : ywlx.trim();
    }

    public Integer getParamxh() {
        return paramxh;
    }

    public void setParamxh(Integer paramxh) {
        this.paramxh = paramxh;
    }

    public String getParamname() {
        return paramname;
    }

    public void setParamname(String paramname) {
        this.paramname = paramname == null ? null : paramname.trim();
    }

    public String getParamchnname() {
        return paramchnname;
    }

    public void setParamchnname(String paramchnname) {
        this.paramchnname = paramchnname == null ? null : paramchnname.trim();
    }

    public String getParamtype() {
        return paramtype;
    }

    public void setParamtype(String paramtype) {
        this.paramtype = paramtype == null ? null : paramtype.trim();
    }

    public String getDatalisttype() {
        return datalisttype;
    }

    public void setDatalisttype(String datalisttype) {
        this.datalisttype = datalisttype == null ? null : datalisttype.trim();
    }

    public String getDatalistvalue() {
        return datalistvalue;
    }

    public void setDatalistvalue(String datalistvalue) {
        this.datalistvalue = datalistvalue == null ? null : datalistvalue.trim();
    }

    public String getDefaultvalue() {
        return defaultvalue;
    }

    public void setDefaultvalue(String defaultvalue) {
        this.defaultvalue = defaultvalue == null ? null : defaultvalue.trim();
    }

    public String getReadonly() {
        return readonly;
    }

    public void setReadonly(String readonly) {
        this.readonly = readonly == null ? null : readonly.trim();
    }

    public String getSearchurl() {
        return searchurl;
    }

    public void setSearchurl(String searchurl) {
        this.searchurl = searchurl == null ? null : searchurl.trim();
    }
}