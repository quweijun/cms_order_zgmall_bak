package com.gene.mobilemaster.model;

import java.util.Date;

public class Integral_rules {
    private Integer rId;

    private Integer classid;

    private String rulesClass;

    private Date startdate;

    private Date enddate;

    private Integer flag;

    private Date adddate;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getRulesClass() {
        return rulesClass;
    }

    public void setRulesClass(String rulesClass) {
        this.rulesClass = rulesClass == null ? null : rulesClass.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }
}