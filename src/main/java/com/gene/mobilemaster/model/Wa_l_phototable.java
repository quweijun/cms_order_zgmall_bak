package com.gene.mobilemaster.model;

import java.util.Date;

public class Wa_l_phototable {
    private String waCpid;

    private String phototype;

    private String photosize;

    private String photoname;

    private String filepath;

    private Integer xhs;

    private Date addtime;

    public String getWaCpid() {
        return waCpid;
    }

    public void setWaCpid(String waCpid) {
        this.waCpid = waCpid == null ? null : waCpid.trim();
    }

    public String getPhototype() {
        return phototype;
    }

    public void setPhototype(String phototype) {
        this.phototype = phototype == null ? null : phototype.trim();
    }

    public String getPhotosize() {
        return photosize;
    }

    public void setPhotosize(String photosize) {
        this.photosize = photosize == null ? null : photosize.trim();
    }

    public String getPhotoname() {
        return photoname;
    }

    public void setPhotoname(String photoname) {
        this.photoname = photoname == null ? null : photoname.trim();
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public Integer getXhs() {
        return xhs;
    }

    public void setXhs(Integer xhs) {
        this.xhs = xhs;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}