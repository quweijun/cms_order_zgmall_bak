package com.gene.mobilemaster.model;

public class Customer_tjstatics {
    private String tjCustomermobile;

    private Long tjCustomerid;

    private String tjCustomername;

    private Integer tjcount;

    private Integer tjbindcount;

    public String getTjCustomermobile() {
        return tjCustomermobile;
    }

    public void setTjCustomermobile(String tjCustomermobile) {
        this.tjCustomermobile = tjCustomermobile == null ? null : tjCustomermobile.trim();
    }

    public Long getTjCustomerid() {
        return tjCustomerid;
    }

    public void setTjCustomerid(Long tjCustomerid) {
        this.tjCustomerid = tjCustomerid;
    }

    public String getTjCustomername() {
        return tjCustomername;
    }

    public void setTjCustomername(String tjCustomername) {
        this.tjCustomername = tjCustomername == null ? null : tjCustomername.trim();
    }

    public Integer getTjcount() {
        return tjcount;
    }

    public void setTjcount(Integer tjcount) {
        this.tjcount = tjcount;
    }

    public Integer getTjbindcount() {
        return tjbindcount;
    }

    public void setTjbindcount(Integer tjbindcount) {
        this.tjbindcount = tjbindcount;
    }
}