package com.gene.mobilemaster.model;

public class Subclass {
    private Integer id;

    private Integer bigid;

    private Integer smallid;

    private String typename;

    private Integer flag;

    private Integer xhs;

    private Integer orders;

    private String androidIcon;

    private String jdfl;

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

    public Integer getSmallid() {
        return smallid;
    }

    public void setSmallid(Integer smallid) {
        this.smallid = smallid;
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

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public String getAndroidIcon() {
        return androidIcon;
    }

    public void setAndroidIcon(String androidIcon) {
        this.androidIcon = androidIcon == null ? null : androidIcon.trim();
    }

    public String getJdfl() {
        return jdfl;
    }

    public void setJdfl(String jdfl) {
        this.jdfl = jdfl == null ? null : jdfl.trim();
    }
}