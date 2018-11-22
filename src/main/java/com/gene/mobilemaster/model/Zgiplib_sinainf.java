package com.gene.mobilemaster.model;

import java.util.Date;

public class Zgiplib_sinainf {
    private Long flowno;

    private String startip;

    private String endip;

    private Long startipnum;

    private Long endipnum;

    private String country;

    private String sheng;

    private String shi;

    private String network;

    private String fullipmsg;

    private Date addtime;

    public Long getFlowno() {
        return flowno;
    }

    public void setFlowno(Long flowno) {
        this.flowno = flowno;
    }

    public String getStartip() {
        return startip;
    }

    public void setStartip(String startip) {
        this.startip = startip == null ? null : startip.trim();
    }

    public String getEndip() {
        return endip;
    }

    public void setEndip(String endip) {
        this.endip = endip == null ? null : endip.trim();
    }

    public Long getStartipnum() {
        return startipnum;
    }

    public void setStartipnum(Long startipnum) {
        this.startipnum = startipnum;
    }

    public Long getEndipnum() {
        return endipnum;
    }

    public void setEndipnum(Long endipnum) {
        this.endipnum = endipnum;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng == null ? null : sheng.trim();
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi == null ? null : shi.trim();
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network == null ? null : network.trim();
    }

    public String getFullipmsg() {
        return fullipmsg;
    }

    public void setFullipmsg(String fullipmsg) {
        this.fullipmsg = fullipmsg == null ? null : fullipmsg.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}