package com.gene.mobilemaster.model;

public class Phototype_s {
    private String picdm;

    private String picsize;

    private Integer phototypeid;

    public String getPicdm() {
        return picdm;
    }

    public void setPicdm(String picdm) {
        this.picdm = picdm == null ? null : picdm.trim();
    }

    public String getPicsize() {
        return picsize;
    }

    public void setPicsize(String picsize) {
        this.picsize = picsize == null ? null : picsize.trim();
    }

    public Integer getPhototypeid() {
        return phototypeid;
    }

    public void setPhototypeid(Integer phototypeid) {
        this.phototypeid = phototypeid;
    }
}