package com.gene.mobilemaster.model;

import java.util.Date;

public class Community_log {
    private Long comLogId;

    private Long comRuleId;

    private String operation;

    private Integer score;

    private String customerid;

    private Date addDate;

    private Integer flag;

    public Long getComLogId() {
        return comLogId;
    }

    public void setComLogId(Long comLogId) {
        this.comLogId = comLogId;
    }

    public Long getComRuleId() {
        return comRuleId;
    }

    public void setComRuleId(Long comRuleId) {
        this.comRuleId = comRuleId;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}