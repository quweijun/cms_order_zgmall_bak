package com.gene.mobilemaster.model;

import java.util.Date;

public class Expresssyncstatics_old {
    private Long flowno;

    private String expressid;

    private String expresscompany;

    private String expressstatus;

    private Date lastuptdate;

    private String fullexpressstatus;

    public Long getFlowno() {
        return flowno;
    }

    public void setFlowno(Long flowno) {
        this.flowno = flowno;
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public String getExpresscompany() {
        return expresscompany;
    }

    public void setExpresscompany(String expresscompany) {
        this.expresscompany = expresscompany == null ? null : expresscompany.trim();
    }

    public String getExpressstatus() {
        return expressstatus;
    }

    public void setExpressstatus(String expressstatus) {
        this.expressstatus = expressstatus == null ? null : expressstatus.trim();
    }

    public Date getLastuptdate() {
        return lastuptdate;
    }

    public void setLastuptdate(Date lastuptdate) {
        this.lastuptdate = lastuptdate;
    }

    public String getFullexpressstatus() {
        return fullexpressstatus;
    }

    public void setFullexpressstatus(String fullexpressstatus) {
        this.fullexpressstatus = fullexpressstatus == null ? null : fullexpressstatus.trim();
    }
}