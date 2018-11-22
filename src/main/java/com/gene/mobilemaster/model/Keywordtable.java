package com.gene.mobilemaster.model;

public class Keywordtable {
    private Integer id;

    private Integer typeid;

    private Integer smallid;

    private String keyword;

    private Integer flag;

    private Integer hotflag;

    private Integer subclass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getSmallid() {
        return smallid;
    }

    public void setSmallid(Integer smallid) {
        this.smallid = smallid;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getHotflag() {
        return hotflag;
    }

    public void setHotflag(Integer hotflag) {
        this.hotflag = hotflag;
    }

    public Integer getSubclass() {
        return subclass;
    }

    public void setSubclass(Integer subclass) {
        this.subclass = subclass;
    }
}