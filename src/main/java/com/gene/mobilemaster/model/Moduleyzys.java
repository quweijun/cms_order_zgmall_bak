package com.gene.mobilemaster.model;

import java.util.Date;

public class Moduleyzys {
    private Integer yzysid;

    private String name;

    private String content;

    private Date addtime;

    private Date updatedate;

    private String quickcfgstrlist;

    private String yzbqlx;

    private String syfw;

    private String enableflag;

    private String adduser;

    public Integer getYzysid() {
        return yzysid;
    }

    public void setYzysid(Integer yzysid) {
        this.yzysid = yzysid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getQuickcfgstrlist() {
        return quickcfgstrlist;
    }

    public void setQuickcfgstrlist(String quickcfgstrlist) {
        this.quickcfgstrlist = quickcfgstrlist == null ? null : quickcfgstrlist.trim();
    }

    public String getYzbqlx() {
        return yzbqlx;
    }

    public void setYzbqlx(String yzbqlx) {
        this.yzbqlx = yzbqlx == null ? null : yzbqlx.trim();
    }

    public String getSyfw() {
        return syfw;
    }

    public void setSyfw(String syfw) {
        this.syfw = syfw == null ? null : syfw.trim();
    }

    public String getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(String enableflag) {
        this.enableflag = enableflag == null ? null : enableflag.trim();
    }

    public String getAdduser() {
        return adduser;
    }

    public void setAdduser(String adduser) {
        this.adduser = adduser == null ? null : adduser.trim();
    }
}