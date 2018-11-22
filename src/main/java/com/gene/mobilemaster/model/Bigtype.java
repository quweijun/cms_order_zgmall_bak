package com.gene.mobilemaster.model;

public class Bigtype {
    private Integer id;

    private String typename;

    private Integer flag;

    private Integer xhs;

    private String bgimg;

    private String bigcss;

    private Integer isshow;

    private String displayname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getBigcss() {
        return bigcss;
    }

    public void setBigcss(String bigcss) {
        this.bigcss = bigcss == null ? null : bigcss.trim();
    }

    public Integer getIsshow() {
        return isshow;
    }

    public void setIsshow(Integer isshow) {
        this.isshow = isshow;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname == null ? null : displayname.trim();
    }
}