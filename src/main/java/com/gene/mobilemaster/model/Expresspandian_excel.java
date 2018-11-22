package com.gene.mobilemaster.model;

import java.util.Date;

public class Expresspandian_excel {
    private Long pkid;

    private String fileid;

    private Double barcodeid;

    private String exceltype;

    private Date adddate;

    private Integer iscangku;

    private Integer iskucun;

    private String username;

    public Long getPkid() {
        return pkid;
    }

    public void setPkid(Long pkid) {
        this.pkid = pkid;
    }

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid == null ? null : fileid.trim();
    }

    public Double getBarcodeid() {
        return barcodeid;
    }

    public void setBarcodeid(Double barcodeid) {
        this.barcodeid = barcodeid;
    }

    public String getExceltype() {
        return exceltype;
    }

    public void setExceltype(String exceltype) {
        this.exceltype = exceltype == null ? null : exceltype.trim();
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public Integer getIscangku() {
        return iscangku;
    }

    public void setIscangku(Integer iscangku) {
        this.iscangku = iscangku;
    }

    public Integer getIskucun() {
        return iskucun;
    }

    public void setIskucun(Integer iskucun) {
        this.iskucun = iskucun;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}