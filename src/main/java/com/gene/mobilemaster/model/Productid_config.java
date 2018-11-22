package com.gene.mobilemaster.model;

public class Productid_config {
    private String bigtype;

    private String smalltype;

    private Double startindex;

    private String smallid;

    private String subclassid;

    private Integer id;

    private String bigid;

    public String getBigtype() {
        return bigtype;
    }

    public void setBigtype(String bigtype) {
        this.bigtype = bigtype == null ? null : bigtype.trim();
    }

    public String getSmalltype() {
        return smalltype;
    }

    public void setSmalltype(String smalltype) {
        this.smalltype = smalltype == null ? null : smalltype.trim();
    }

    public Double getStartindex() {
        return startindex;
    }

    public void setStartindex(Double startindex) {
        this.startindex = startindex;
    }

    public String getSmallid() {
        return smallid;
    }

    public void setSmallid(String smallid) {
        this.smallid = smallid == null ? null : smallid.trim();
    }

    public String getSubclassid() {
        return subclassid;
    }

    public void setSubclassid(String subclassid) {
        this.subclassid = subclassid == null ? null : subclassid.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBigid() {
        return bigid;
    }

    public void setBigid(String bigid) {
        this.bigid = bigid == null ? null : bigid.trim();
    }
}