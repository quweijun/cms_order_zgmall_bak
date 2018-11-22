package com.gene.mobilemaster.model;

import java.util.Date;

public class Wk_villages {
    private Integer wkVillagesId;

    private Integer wkCompany;

    private String wkProvince;

    private String wkCity;

    private String wkArea;

    private String wkVillages;

    private String wkUser;

    private String wkBz;

    private Date wkAddtime;

    public Integer getWkVillagesId() {
        return wkVillagesId;
    }

    public void setWkVillagesId(Integer wkVillagesId) {
        this.wkVillagesId = wkVillagesId;
    }

    public Integer getWkCompany() {
        return wkCompany;
    }

    public void setWkCompany(Integer wkCompany) {
        this.wkCompany = wkCompany;
    }

    public String getWkProvince() {
        return wkProvince;
    }

    public void setWkProvince(String wkProvince) {
        this.wkProvince = wkProvince == null ? null : wkProvince.trim();
    }

    public String getWkCity() {
        return wkCity;
    }

    public void setWkCity(String wkCity) {
        this.wkCity = wkCity == null ? null : wkCity.trim();
    }

    public String getWkArea() {
        return wkArea;
    }

    public void setWkArea(String wkArea) {
        this.wkArea = wkArea == null ? null : wkArea.trim();
    }

    public String getWkVillages() {
        return wkVillages;
    }

    public void setWkVillages(String wkVillages) {
        this.wkVillages = wkVillages == null ? null : wkVillages.trim();
    }

    public String getWkUser() {
        return wkUser;
    }

    public void setWkUser(String wkUser) {
        this.wkUser = wkUser == null ? null : wkUser.trim();
    }

    public String getWkBz() {
        return wkBz;
    }

    public void setWkBz(String wkBz) {
        this.wkBz = wkBz == null ? null : wkBz.trim();
    }

    public Date getWkAddtime() {
        return wkAddtime;
    }

    public void setWkAddtime(Date wkAddtime) {
        this.wkAddtime = wkAddtime;
    }
}