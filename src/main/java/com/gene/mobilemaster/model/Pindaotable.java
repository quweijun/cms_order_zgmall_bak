package com.gene.mobilemaster.model;

public class Pindaotable {
    private Integer pid;

    private String pindaoid;

    private String pindaoname;

    private String pindaourl;

    private Integer flag;

    private Integer pindaoflag;

    private Integer ispublic;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPindaoid() {
        return pindaoid;
    }

    public void setPindaoid(String pindaoid) {
        this.pindaoid = pindaoid == null ? null : pindaoid.trim();
    }

    public String getPindaoname() {
        return pindaoname;
    }

    public void setPindaoname(String pindaoname) {
        this.pindaoname = pindaoname == null ? null : pindaoname.trim();
    }

    public String getPindaourl() {
        return pindaourl;
    }

    public void setPindaourl(String pindaourl) {
        this.pindaourl = pindaourl == null ? null : pindaourl.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getPindaoflag() {
        return pindaoflag;
    }

    public void setPindaoflag(Integer pindaoflag) {
        this.pindaoflag = pindaoflag;
    }

    public Integer getIspublic() {
        return ispublic;
    }

    public void setIspublic(Integer ispublic) {
        this.ispublic = ispublic;
    }
}