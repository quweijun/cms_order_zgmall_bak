package com.gene.mobilemaster.model;

public class Zgidtocpid {
    private String zgid;

    private String cpid;

    public String getZgid() {
        return zgid;
    }

    public void setZgid(String zgid) {
        this.zgid = zgid == null ? null : zgid.trim();
    }

    public String getCpid() {
        return cpid;
    }

    public void setCpid(String cpid) {
        this.cpid = cpid == null ? null : cpid.trim();
    }
}