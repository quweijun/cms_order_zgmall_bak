package com.gene.mobilemaster.model;

public class Province2 {
    private Integer id;

    private String shengname;

    private String shengno;

    private Integer shengorder;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShengname() {
        return shengname;
    }

    public void setShengname(String shengname) {
        this.shengname = shengname == null ? null : shengname.trim();
    }

    public String getShengno() {
        return shengno;
    }

    public void setShengno(String shengno) {
        this.shengno = shengno == null ? null : shengno.trim();
    }

    public Integer getShengorder() {
        return shengorder;
    }

    public void setShengorder(Integer shengorder) {
        this.shengorder = shengorder;
    }
}