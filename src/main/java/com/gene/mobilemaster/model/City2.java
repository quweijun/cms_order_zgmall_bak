package com.gene.mobilemaster.model;

public class City2 {
    private Integer id;

    private String shiname;

    private String shino;

    private Integer shiorder;

    private Integer shengid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShiname() {
        return shiname;
    }

    public void setShiname(String shiname) {
        this.shiname = shiname == null ? null : shiname.trim();
    }

    public String getShino() {
        return shino;
    }

    public void setShino(String shino) {
        this.shino = shino == null ? null : shino.trim();
    }

    public Integer getShiorder() {
        return shiorder;
    }

    public void setShiorder(Integer shiorder) {
        this.shiorder = shiorder;
    }

    public Integer getShengid() {
        return shengid;
    }

    public void setShengid(Integer shengid) {
        this.shengid = shengid;
    }
}