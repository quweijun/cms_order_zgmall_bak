package com.gene.mobilemaster.model;

import java.util.Date;

public class Score_log {
    private Long scoreLogId;

    private Long scoreRuleId;

    private String operation;

    private Integer score;

    private String productid;

    private String orderid;

    private String customerid;

    private Long jiangpinid;

    private Date addDate;

    private Integer flag;

    private Integer jifentojiangpinid;

    public Long getScoreLogId() {
        return scoreLogId;
    }

    public void setScoreLogId(Long scoreLogId) {
        this.scoreLogId = scoreLogId;
    }

    public Long getScoreRuleId() {
        return scoreRuleId;
    }

    public void setScoreRuleId(Long scoreRuleId) {
        this.scoreRuleId = scoreRuleId;
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

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public Long getJiangpinid() {
        return jiangpinid;
    }

    public void setJiangpinid(Long jiangpinid) {
        this.jiangpinid = jiangpinid;
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

    public Integer getJifentojiangpinid() {
        return jifentojiangpinid;
    }

    public void setJifentojiangpinid(Integer jifentojiangpinid) {
        this.jifentojiangpinid = jifentojiangpinid;
    }
}