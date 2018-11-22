package com.gene.mobilemaster.model;

public class Ubblib {
    private Long flowno;

    private String ubbtype;

    private String ubbname;

    private String ubbcode;

    private String bzdesc;

    private Integer enableflag;

    private Integer xh;

    public Long getFlowno() {
        return flowno;
    }

    public void setFlowno(Long flowno) {
        this.flowno = flowno;
    }

    public String getUbbtype() {
        return ubbtype;
    }

    public void setUbbtype(String ubbtype) {
        this.ubbtype = ubbtype == null ? null : ubbtype.trim();
    }

    public String getUbbname() {
        return ubbname;
    }

    public void setUbbname(String ubbname) {
        this.ubbname = ubbname == null ? null : ubbname.trim();
    }

    public String getUbbcode() {
        return ubbcode;
    }

    public void setUbbcode(String ubbcode) {
        this.ubbcode = ubbcode == null ? null : ubbcode.trim();
    }

    public String getBzdesc() {
        return bzdesc;
    }

    public void setBzdesc(String bzdesc) {
        this.bzdesc = bzdesc == null ? null : bzdesc.trim();
    }

    public Integer getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Integer enableflag) {
        this.enableflag = enableflag;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }
}