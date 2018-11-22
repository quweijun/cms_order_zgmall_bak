package com.gene.mobilemaster.model;

import java.util.Date;

public class Searchkey {
    private Integer searchid;

    private Integer pageid;

    private Integer site;

    private Integer searchtype;

    private Integer keyid;

    private String keyword;

    private String keyurl;

    private Integer flag;

    private Date edittime;

    private String editor;

    private Integer taxis;

    private Integer flag2;

    private String protypes;

    private Integer keybigtype;

    private Integer redflag;

    public Integer getSearchid() {
        return searchid;
    }

    public void setSearchid(Integer searchid) {
        this.searchid = searchid;
    }

    public Integer getPageid() {
        return pageid;
    }

    public void setPageid(Integer pageid) {
        this.pageid = pageid;
    }

    public Integer getSite() {
        return site;
    }

    public void setSite(Integer site) {
        this.site = site;
    }

    public Integer getSearchtype() {
        return searchtype;
    }

    public void setSearchtype(Integer searchtype) {
        this.searchtype = searchtype;
    }

    public Integer getKeyid() {
        return keyid;
    }

    public void setKeyid(Integer keyid) {
        this.keyid = keyid;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getKeyurl() {
        return keyurl;
    }

    public void setKeyurl(String keyurl) {
        this.keyurl = keyurl == null ? null : keyurl.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public Integer getTaxis() {
        return taxis;
    }

    public void setTaxis(Integer taxis) {
        this.taxis = taxis;
    }

    public Integer getFlag2() {
        return flag2;
    }

    public void setFlag2(Integer flag2) {
        this.flag2 = flag2;
    }

    public String getProtypes() {
        return protypes;
    }

    public void setProtypes(String protypes) {
        this.protypes = protypes == null ? null : protypes.trim();
    }

    public Integer getKeybigtype() {
        return keybigtype;
    }

    public void setKeybigtype(Integer keybigtype) {
        this.keybigtype = keybigtype;
    }

    public Integer getRedflag() {
        return redflag;
    }

    public void setRedflag(Integer redflag) {
        this.redflag = redflag;
    }
}