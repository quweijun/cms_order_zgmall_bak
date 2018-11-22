package com.gene.mobilemaster.model;

import java.util.Date;

public class Treemiddletable {
    private Date accecctime;

    private String productname;

    private Integer vcount;

    private String productid;

    private Integer bigtype;

    public Date getAccecctime() {
        return accecctime;
    }

    public void setAccecctime(Date accecctime) {
        this.accecctime = accecctime;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public Integer getVcount() {
        return vcount;
    }

    public void setVcount(Integer vcount) {
        this.vcount = vcount;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Integer getBigtype() {
        return bigtype;
    }

    public void setBigtype(Integer bigtype) {
        this.bigtype = bigtype;
    }
}