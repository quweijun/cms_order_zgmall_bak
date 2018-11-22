package com.gene.mobilemaster.model;

import java.util.Date;

public class Pushmagsubdomain {
    private Integer id;

    private String subdomainid;

    private String subdomainstatus;

    private Date createdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubdomainid() {
        return subdomainid;
    }

    public void setSubdomainid(String subdomainid) {
        this.subdomainid = subdomainid == null ? null : subdomainid.trim();
    }

    public String getSubdomainstatus() {
        return subdomainstatus;
    }

    public void setSubdomainstatus(String subdomainstatus) {
        this.subdomainstatus = subdomainstatus == null ? null : subdomainstatus.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}