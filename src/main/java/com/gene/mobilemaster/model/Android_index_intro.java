package com.gene.mobilemaster.model;

import java.util.Date;

public class Android_index_intro {
    private Integer id;

    private String logo;

    private String indexLoadingImg;

    private String adduser;

    private Date addtime;

    private String flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getIndexLoadingImg() {
        return indexLoadingImg;
    }

    public void setIndexLoadingImg(String indexLoadingImg) {
        this.indexLoadingImg = indexLoadingImg == null ? null : indexLoadingImg.trim();
    }

    public String getAdduser() {
        return adduser;
    }

    public void setAdduser(String adduser) {
        this.adduser = adduser == null ? null : adduser.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }
}