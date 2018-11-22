package com.gene.mobilemaster.model;

public class Ordertrackingcfg {
    private Integer id;

    private String earlytype;

    private String description;

    private Integer morethandate;

    private Integer lessthandate;

    private Integer datehour;

    private Integer bz;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEarlytype() {
        return earlytype;
    }

    public void setEarlytype(String earlytype) {
        this.earlytype = earlytype == null ? null : earlytype.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getMorethandate() {
        return morethandate;
    }

    public void setMorethandate(Integer morethandate) {
        this.morethandate = morethandate;
    }

    public Integer getLessthandate() {
        return lessthandate;
    }

    public void setLessthandate(Integer lessthandate) {
        this.lessthandate = lessthandate;
    }

    public Integer getDatehour() {
        return datehour;
    }

    public void setDatehour(Integer datehour) {
        this.datehour = datehour;
    }

    public Integer getBz() {
        return bz;
    }

    public void setBz(Integer bz) {
        this.bz = bz;
    }
}