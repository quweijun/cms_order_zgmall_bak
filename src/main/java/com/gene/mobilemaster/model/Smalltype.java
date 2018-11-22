package com.gene.mobilemaster.model;

import java.util.Date;

public class Smalltype {
    private Integer id;

    private Integer bigid;

    private String typename;

    private Integer flag;

    private Date updatetime;

    private String editor;

    private Integer xhs;

    private String bgimg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBigid() {
        return bigid;
    }

    public void setBigid(Integer bigid) {
        this.bigid = bigid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public Integer getXhs() {
        return xhs;
    }

    public void setXhs(Integer xhs) {
        this.xhs = xhs;
    }

    public String getBgimg() {
        return bgimg;
    }

    public void setBgimg(String bgimg) {
        this.bgimg = bgimg == null ? null : bgimg.trim();
    }
}