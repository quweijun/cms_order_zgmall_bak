package com.gene.mobilemaster.model;

import java.util.Date;

public class Phototable_threeimportbackup {
    private Long id;

    private String pid;

    private Integer type;

    private String photo;

    private Date addtime;

    private String addor;

    private Integer serialnumber;

    private Byte enableflag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getAddor() {
        return addor;
    }

    public void setAddor(String addor) {
        this.addor = addor == null ? null : addor.trim();
    }

    public Integer getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(Integer serialnumber) {
        this.serialnumber = serialnumber;
    }

    public Byte getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Byte enableflag) {
        this.enableflag = enableflag;
    }
}