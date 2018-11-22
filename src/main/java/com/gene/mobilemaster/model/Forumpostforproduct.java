package com.gene.mobilemaster.model;

import java.util.Date;

public class Forumpostforproduct {
    private Long id;

    private String productid;

    private String viewsforproduct;

    private Date statisticstime;

    private Integer bigtype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getViewsforproduct() {
        return viewsforproduct;
    }

    public void setViewsforproduct(String viewsforproduct) {
        this.viewsforproduct = viewsforproduct == null ? null : viewsforproduct.trim();
    }

    public Date getStatisticstime() {
        return statisticstime;
    }

    public void setStatisticstime(Date statisticstime) {
        this.statisticstime = statisticstime;
    }

    public Integer getBigtype() {
        return bigtype;
    }

    public void setBigtype(Integer bigtype) {
        this.bigtype = bigtype;
    }
}