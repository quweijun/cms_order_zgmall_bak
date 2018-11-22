package com.gene.mobilemaster.model;

public class Emsdistpydqlib {
    private String sheng;

    private String city;

    private String cityjc;

    private Integer bhcity;

    private String xian;

    private String xianjc;

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng == null ? null : sheng.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCityjc() {
        return cityjc;
    }

    public void setCityjc(String cityjc) {
        this.cityjc = cityjc == null ? null : cityjc.trim();
    }

    public Integer getBhcity() {
        return bhcity;
    }

    public void setBhcity(Integer bhcity) {
        this.bhcity = bhcity;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian == null ? null : xian.trim();
    }

    public String getXianjc() {
        return xianjc;
    }

    public void setXianjc(String xianjc) {
        this.xianjc = xianjc == null ? null : xianjc.trim();
    }
}