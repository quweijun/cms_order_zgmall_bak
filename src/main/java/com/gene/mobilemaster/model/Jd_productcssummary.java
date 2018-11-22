package com.gene.mobilemaster.model;

public class Jd_productcssummary {
    private String cpid;

    private String zgid;

    private String cshz;

    private Integer cssl;

    public String getCpid() {
        return cpid;
    }

    public void setCpid(String cpid) {
        this.cpid = cpid == null ? null : cpid.trim();
    }

    public String getZgid() {
        return zgid;
    }

    public void setZgid(String zgid) {
        this.zgid = zgid == null ? null : zgid.trim();
    }

    public String getCshz() {
        return cshz;
    }

    public void setCshz(String cshz) {
        this.cshz = cshz == null ? null : cshz.trim();
    }

    public Integer getCssl() {
        return cssl;
    }

    public void setCssl(Integer cssl) {
        this.cssl = cssl;
    }
}