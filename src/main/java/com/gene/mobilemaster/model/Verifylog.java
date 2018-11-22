package com.gene.mobilemaster.model;

import java.util.Date;

public class Verifylog {
    private Long id;

    private String verifyid;

    private String verifytype;

    private String remark;

    private String verifier;

    private Date verifytime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVerifyid() {
        return verifyid;
    }

    public void setVerifyid(String verifyid) {
        this.verifyid = verifyid == null ? null : verifyid.trim();
    }

    public String getVerifytype() {
        return verifytype;
    }

    public void setVerifytype(String verifytype) {
        this.verifytype = verifytype == null ? null : verifytype.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getVerifier() {
        return verifier;
    }

    public void setVerifier(String verifier) {
        this.verifier = verifier == null ? null : verifier.trim();
    }

    public Date getVerifytime() {
        return verifytime;
    }

    public void setVerifytime(Date verifytime) {
        this.verifytime = verifytime;
    }
}