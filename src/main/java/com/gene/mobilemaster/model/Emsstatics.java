package com.gene.mobilemaster.model;

import java.util.Date;

public class Emsstatics {
    private String emscode;

    private Double ys;

    private Double ss;

    private Double jsje;

    private Double jsf;

    private Double fwf;

    private Integer emstype;

    private Date emssenddate;

    public String getEmscode() {
        return emscode;
    }

    public void setEmscode(String emscode) {
        this.emscode = emscode == null ? null : emscode.trim();
    }

    public Double getYs() {
        return ys;
    }

    public void setYs(Double ys) {
        this.ys = ys;
    }

    public Double getSs() {
        return ss;
    }

    public void setSs(Double ss) {
        this.ss = ss;
    }

    public Double getJsje() {
        return jsje;
    }

    public void setJsje(Double jsje) {
        this.jsje = jsje;
    }

    public Double getJsf() {
        return jsf;
    }

    public void setJsf(Double jsf) {
        this.jsf = jsf;
    }

    public Double getFwf() {
        return fwf;
    }

    public void setFwf(Double fwf) {
        this.fwf = fwf;
    }

    public Integer getEmstype() {
        return emstype;
    }

    public void setEmstype(Integer emstype) {
        this.emstype = emstype;
    }

    public Date getEmssenddate() {
        return emssenddate;
    }

    public void setEmssenddate(Date emssenddate) {
        this.emssenddate = emssenddate;
    }
}