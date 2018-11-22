package com.gene.mobilemaster.model;

public class Score_total {
    private String customerid;

    private Integer dqjf;

    private Integer ljjf;

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public Integer getDqjf() {
        return dqjf;
    }

    public void setDqjf(Integer dqjf) {
        this.dqjf = dqjf;
    }

    public Integer getLjjf() {
        return ljjf;
    }

    public void setLjjf(Integer ljjf) {
        this.ljjf = ljjf;
    }
}