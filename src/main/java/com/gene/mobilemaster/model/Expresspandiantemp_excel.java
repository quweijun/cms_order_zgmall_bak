package com.gene.mobilemaster.model;

public class Expresspandiantemp_excel {
    private String fileid;

    private Double barcodeid;

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid == null ? null : fileid.trim();
    }

    public Double getBarcodeid() {
        return barcodeid;
    }

    public void setBarcodeid(Double barcodeid) {
        this.barcodeid = barcodeid;
    }
}