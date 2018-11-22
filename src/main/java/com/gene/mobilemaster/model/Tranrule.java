package com.gene.mobilemaster.model;

public class Tranrule {
    private Long flowid;

    private Long provideid;

    private String areaname;

    private Double postamount;

    private Double formalities;

    private String formaltype;

    private Double minformalities;

    private Double backamount;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public Long getProvideid() {
        return provideid;
    }

    public void setProvideid(Long provideid) {
        this.provideid = provideid;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public Double getPostamount() {
        return postamount;
    }

    public void setPostamount(Double postamount) {
        this.postamount = postamount;
    }

    public Double getFormalities() {
        return formalities;
    }

    public void setFormalities(Double formalities) {
        this.formalities = formalities;
    }

    public String getFormaltype() {
        return formaltype;
    }

    public void setFormaltype(String formaltype) {
        this.formaltype = formaltype == null ? null : formaltype.trim();
    }

    public Double getMinformalities() {
        return minformalities;
    }

    public void setMinformalities(Double minformalities) {
        this.minformalities = minformalities;
    }

    public Double getBackamount() {
        return backamount;
    }

    public void setBackamount(Double backamount) {
        this.backamount = backamount;
    }
}