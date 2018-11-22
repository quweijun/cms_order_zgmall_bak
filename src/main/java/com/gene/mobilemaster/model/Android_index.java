package com.gene.mobilemaster.model;

import java.util.Date;

public class Android_index {
    private Integer modalid;

    private String modalname;

    private String modaltile;

    private String searchkeywords;

    private String modalcss;

    private Integer flag;

    private Date addtime;

    private String adduser;

    private Integer smalltype;

    private String iconurl;

    private Integer sort;

    public Integer getModalid() {
        return modalid;
    }

    public void setModalid(Integer modalid) {
        this.modalid = modalid;
    }

    public String getModalname() {
        return modalname;
    }

    public void setModalname(String modalname) {
        this.modalname = modalname == null ? null : modalname.trim();
    }

    public String getModaltile() {
        return modaltile;
    }

    public void setModaltile(String modaltile) {
        this.modaltile = modaltile == null ? null : modaltile.trim();
    }

    public String getSearchkeywords() {
        return searchkeywords;
    }

    public void setSearchkeywords(String searchkeywords) {
        this.searchkeywords = searchkeywords == null ? null : searchkeywords.trim();
    }

    public String getModalcss() {
        return modalcss;
    }

    public void setModalcss(String modalcss) {
        this.modalcss = modalcss == null ? null : modalcss.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getAdduser() {
        return adduser;
    }

    public void setAdduser(String adduser) {
        this.adduser = adduser == null ? null : adduser.trim();
    }

    public Integer getSmalltype() {
        return smalltype;
    }

    public void setSmalltype(Integer smalltype) {
        this.smalltype = smalltype;
    }

    public String getIconurl() {
        return iconurl;
    }

    public void setIconurl(String iconurl) {
        this.iconurl = iconurl == null ? null : iconurl.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}