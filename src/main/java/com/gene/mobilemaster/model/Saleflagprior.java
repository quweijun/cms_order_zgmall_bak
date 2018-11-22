package com.gene.mobilemaster.model;

public class Saleflagprior {
    private String saleflag;

    private Integer priorflag;

    private Integer saletype;

    public String getSaleflag() {
        return saleflag;
    }

    public void setSaleflag(String saleflag) {
        this.saleflag = saleflag == null ? null : saleflag.trim();
    }

    public Integer getPriorflag() {
        return priorflag;
    }

    public void setPriorflag(Integer priorflag) {
        this.priorflag = priorflag;
    }

    public Integer getSaletype() {
        return saletype;
    }

    public void setSaletype(Integer saletype) {
        this.saletype = saletype;
    }
}