package com.gene.mobilemaster.model;

import java.util.Date;

public class Brand {
    private Integer id;

    private String brandname;

    private Integer brandtype;

    private String logo;

    private String staff;

    private Integer flag;

    private Date addtime;

    private String branddesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    public Integer getBrandtype() {
        return brandtype;
    }

    public void setBrandtype(Integer brandtype) {
        this.brandtype = brandtype;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff == null ? null : staff.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getBranddesc() {
        return branddesc;
    }

    public void setBranddesc(String branddesc) {
        this.branddesc = branddesc == null ? null : branddesc.trim();
    }
}