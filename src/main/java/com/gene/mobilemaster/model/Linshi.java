package com.gene.mobilemaster.model;

public class Linshi {
    private String city;

    private String resultcn;

    private String orderid;

    private Integer result;

    private Integer hycompany;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getResultcn() {
        return resultcn;
    }

    public void setResultcn(String resultcn) {
        this.resultcn = resultcn == null ? null : resultcn.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getHycompany() {
        return hycompany;
    }

    public void setHycompany(Integer hycompany) {
        this.hycompany = hycompany;
    }
}