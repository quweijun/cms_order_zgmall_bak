package com.gene.mobilemaster.model;

import java.util.Date;

public class Aftersaleservice {
    private Integer id;

    private String orderid;

    private String ordername;

    private String orderphone;

    private String productid;

    private Integer salestype;

    private Integer orderstate;

    private Integer protype;

    private String detcontents;

    private String userid;

    private Date updatetime;

    private Integer myideaa;

    private Integer mystate;

    private String clService;

    private Date clTime;

    private String kfdesc;

    private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername == null ? null : ordername.trim();
    }

    public String getOrderphone() {
        return orderphone;
    }

    public void setOrderphone(String orderphone) {
        this.orderphone = orderphone == null ? null : orderphone.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Integer getSalestype() {
        return salestype;
    }

    public void setSalestype(Integer salestype) {
        this.salestype = salestype;
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }

    public Integer getProtype() {
        return protype;
    }

    public void setProtype(Integer protype) {
        this.protype = protype;
    }

    public String getDetcontents() {
        return detcontents;
    }

    public void setDetcontents(String detcontents) {
        this.detcontents = detcontents == null ? null : detcontents.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getMyideaa() {
        return myideaa;
    }

    public void setMyideaa(Integer myideaa) {
        this.myideaa = myideaa;
    }

    public Integer getMystate() {
        return mystate;
    }

    public void setMystate(Integer mystate) {
        this.mystate = mystate;
    }

    public String getClService() {
        return clService;
    }

    public void setClService(String clService) {
        this.clService = clService == null ? null : clService.trim();
    }

    public Date getClTime() {
        return clTime;
    }

    public void setClTime(Date clTime) {
        this.clTime = clTime;
    }

    public String getKfdesc() {
        return kfdesc;
    }

    public void setKfdesc(String kfdesc) {
        this.kfdesc = kfdesc == null ? null : kfdesc.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}