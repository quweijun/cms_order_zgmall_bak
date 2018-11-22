package com.gene.mobilemaster.model;

public class Zgiplib {
    private Integer flowno;

    private Long ipstart;

    private Long ipend;

    private String shengid;

    private String sheng;

    private String shi;

    private String ipnet;

    private Integer iplen;

    private Integer ipprior;

    public Integer getFlowno() {
        return flowno;
    }

    public void setFlowno(Integer flowno) {
        this.flowno = flowno;
    }

    public Long getIpstart() {
        return ipstart;
    }

    public void setIpstart(Long ipstart) {
        this.ipstart = ipstart;
    }

    public Long getIpend() {
        return ipend;
    }

    public void setIpend(Long ipend) {
        this.ipend = ipend;
    }

    public String getShengid() {
        return shengid;
    }

    public void setShengid(String shengid) {
        this.shengid = shengid == null ? null : shengid.trim();
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

    public String getIpnet() {
        return ipnet;
    }

    public void setIpnet(String ipnet) {
        this.ipnet = ipnet == null ? null : ipnet.trim();
    }

    public Integer getIplen() {
        return iplen;
    }

    public void setIplen(Integer iplen) {
        this.iplen = iplen;
    }

    public Integer getIpprior() {
        return ipprior;
    }

    public void setIpprior(Integer ipprior) {
        this.ipprior = ipprior;
    }
}