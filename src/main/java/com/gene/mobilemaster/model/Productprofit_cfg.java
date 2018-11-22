package com.gene.mobilemaster.model;

public class Productprofit_cfg {
    private Integer flowid;

    private Double providecostHigh;

    private Double providecostLow;

    private Double transfercost;

    private Double channelcost;

    private Double packagecost;

    private Double profitHighLimit;

    private Double profitLowLimit;

    private String bigtype;

    private String smalltype;

    private String subclass;

    private Double managementcost;

    private Double replacecost;

    public Integer getFlowid() {
        return flowid;
    }

    public void setFlowid(Integer flowid) {
        this.flowid = flowid;
    }

    public Double getProvidecostHigh() {
        return providecostHigh;
    }

    public void setProvidecostHigh(Double providecostHigh) {
        this.providecostHigh = providecostHigh;
    }

    public Double getProvidecostLow() {
        return providecostLow;
    }

    public void setProvidecostLow(Double providecostLow) {
        this.providecostLow = providecostLow;
    }

    public Double getTransfercost() {
        return transfercost;
    }

    public void setTransfercost(Double transfercost) {
        this.transfercost = transfercost;
    }

    public Double getChannelcost() {
        return channelcost;
    }

    public void setChannelcost(Double channelcost) {
        this.channelcost = channelcost;
    }

    public Double getPackagecost() {
        return packagecost;
    }

    public void setPackagecost(Double packagecost) {
        this.packagecost = packagecost;
    }

    public Double getProfitHighLimit() {
        return profitHighLimit;
    }

    public void setProfitHighLimit(Double profitHighLimit) {
        this.profitHighLimit = profitHighLimit;
    }

    public Double getProfitLowLimit() {
        return profitLowLimit;
    }

    public void setProfitLowLimit(Double profitLowLimit) {
        this.profitLowLimit = profitLowLimit;
    }

    public String getBigtype() {
        return bigtype;
    }

    public void setBigtype(String bigtype) {
        this.bigtype = bigtype == null ? null : bigtype.trim();
    }

    public String getSmalltype() {
        return smalltype;
    }

    public void setSmalltype(String smalltype) {
        this.smalltype = smalltype == null ? null : smalltype.trim();
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass == null ? null : subclass.trim();
    }

    public Double getManagementcost() {
        return managementcost;
    }

    public void setManagementcost(Double managementcost) {
        this.managementcost = managementcost;
    }

    public Double getReplacecost() {
        return replacecost;
    }

    public void setReplacecost(Double replacecost) {
        this.replacecost = replacecost;
    }
}