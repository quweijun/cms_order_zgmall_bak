package com.gene.mobilemaster.model;

import java.util.Date;

public class Customeryhmsg {
    private String customerid;

    private String yhmc;

    private String khdz;

    private String khm;

    private String khzh;

    private Date addtime;

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getYhmc() {
        return yhmc;
    }

    public void setYhmc(String yhmc) {
        this.yhmc = yhmc == null ? null : yhmc.trim();
    }

    public String getKhdz() {
        return khdz;
    }

    public void setKhdz(String khdz) {
        this.khdz = khdz == null ? null : khdz.trim();
    }

    public String getKhm() {
        return khm;
    }

    public void setKhm(String khm) {
        this.khm = khm == null ? null : khm.trim();
    }

    public String getKhzh() {
        return khzh;
    }

    public void setKhzh(String khzh) {
        this.khzh = khzh == null ? null : khzh.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}