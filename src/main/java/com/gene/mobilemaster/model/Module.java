package com.gene.mobilemaster.model;

public class Module {
    private Long moduleid;

    private String modulename;

    private String chmodulename;

    public Long getModuleid() {
        return moduleid;
    }

    public void setModuleid(Long moduleid) {
        this.moduleid = moduleid;
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename == null ? null : modulename.trim();
    }

    public String getChmodulename() {
        return chmodulename;
    }

    public void setChmodulename(String chmodulename) {
        this.chmodulename = chmodulename == null ? null : chmodulename.trim();
    }
}