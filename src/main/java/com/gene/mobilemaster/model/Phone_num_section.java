package com.gene.mobilemaster.model;

public class Phone_num_section {
    private Integer telid;

    private String operator;

    private String numberSection;

    private String network;

    private String networkdesc;

    private Integer flag;

    public Integer getTelid() {
        return telid;
    }

    public void setTelid(Integer telid) {
        this.telid = telid;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getNumberSection() {
        return numberSection;
    }

    public void setNumberSection(String numberSection) {
        this.numberSection = numberSection == null ? null : numberSection.trim();
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network == null ? null : network.trim();
    }

    public String getNetworkdesc() {
        return networkdesc;
    }

    public void setNetworkdesc(String networkdesc) {
        this.networkdesc = networkdesc == null ? null : networkdesc.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}