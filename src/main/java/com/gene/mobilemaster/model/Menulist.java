package com.gene.mobilemaster.model;

public class Menulist {
    private Long menuid;

    private String mainmenuid;

    private String menuname;

    private String imagename;

    private String imageurl;

    private String menuurl;

    private Integer xh;

    private String mddh;

    private String newMddh;

    public Long getMenuid() {
        return menuid;
    }

    public void setMenuid(Long menuid) {
        this.menuid = menuid;
    }

    public String getMainmenuid() {
        return mainmenuid;
    }

    public void setMainmenuid(String mainmenuid) {
        this.mainmenuid = mainmenuid == null ? null : mainmenuid.trim();
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename == null ? null : imagename.trim();
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl == null ? null : menuurl.trim();
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getMddh() {
        return mddh;
    }

    public void setMddh(String mddh) {
        this.mddh = mddh == null ? null : mddh.trim();
    }

    public String getNewMddh() {
        return newMddh;
    }

    public void setNewMddh(String newMddh) {
        this.newMddh = newMddh == null ? null : newMddh.trim();
    }
}