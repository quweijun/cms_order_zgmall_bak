package com.gene.mobilemaster.model;

import java.util.Date;

public class Stock_track {
    private String rknumber;

    private Integer condition;

    private Date addtime;

    private String operator;

    public String getRknumber() {
        return rknumber;
    }

    public void setRknumber(String rknumber) {
        this.rknumber = rknumber == null ? null : rknumber.trim();
    }

    public Integer getCondition() {
        return condition;
    }

    public void setCondition(Integer condition) {
        this.condition = condition;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}