package com.gene.mobilemaster.model;

public class Type_pindao_relation {
    private Integer id;

    private Integer typeid;

    private String showtitle;

    private Integer configid;

    private Integer pindaoid;

    private Integer categoryid;

    private Integer enableflag;

    private Integer newcptimeout;

    private Integer hotcptimeout;

    private Integer pkflag;

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

    public String getShowtitle() {
        return showtitle;
    }

    public void setShowtitle(String showtitle) {
        this.showtitle = showtitle == null ? null : showtitle.trim();
    }

    public Integer getConfigid() {
        return configid;
    }

    public void setConfigid(Integer configid) {
        this.configid = configid;
    }

    public Integer getPindaoid() {
        return pindaoid;
    }

    public void setPindaoid(Integer pindaoid) {
        this.pindaoid = pindaoid;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public Integer getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Integer enableflag) {
        this.enableflag = enableflag;
    }

    public Integer getNewcptimeout() {
        return newcptimeout;
    }

    public void setNewcptimeout(Integer newcptimeout) {
        this.newcptimeout = newcptimeout;
    }

    public Integer getHotcptimeout() {
        return hotcptimeout;
    }

    public void setHotcptimeout(Integer hotcptimeout) {
        this.hotcptimeout = hotcptimeout;
    }

    public Integer getPkflag() {
        return pkflag;
    }

    public void setPkflag(Integer pkflag) {
        this.pkflag = pkflag;
    }
}