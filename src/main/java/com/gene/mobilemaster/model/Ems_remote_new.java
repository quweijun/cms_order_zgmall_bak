package com.gene.mobilemaster.model;

public class Ems_remote_new {
    private String sheng;

    private String shi;

    private Integer cityNum;

    private String xian;

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng == null ? null : sheng.trim();
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi == null ? null : shi.trim();
    }

    public Integer getCityNum() {
        return cityNum;
    }

    public void setCityNum(Integer cityNum) {
        this.cityNum = cityNum;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian == null ? null : xian.trim();
    }
}