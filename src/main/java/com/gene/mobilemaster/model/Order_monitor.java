package com.gene.mobilemaster.model;

public class Order_monitor {
    private String truename;

    private String mobilenumber;

    private Integer dgjcount;

    private Integer dqrcount;

    private Integer dfhcount;

    private Integer yfhcount;

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename == null ? null : truename.trim();
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber == null ? null : mobilenumber.trim();
    }

    public Integer getDgjcount() {
        return dgjcount;
    }

    public void setDgjcount(Integer dgjcount) {
        this.dgjcount = dgjcount;
    }

    public Integer getDqrcount() {
        return dqrcount;
    }

    public void setDqrcount(Integer dqrcount) {
        this.dqrcount = dqrcount;
    }

    public Integer getDfhcount() {
        return dfhcount;
    }

    public void setDfhcount(Integer dfhcount) {
        this.dfhcount = dfhcount;
    }

    public Integer getYfhcount() {
        return yfhcount;
    }

    public void setYfhcount(Integer yfhcount) {
        this.yfhcount = yfhcount;
    }
}