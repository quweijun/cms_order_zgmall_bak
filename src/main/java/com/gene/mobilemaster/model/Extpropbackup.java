package com.gene.mobilemaster.model;

public class Extpropbackup {
    private Integer flowid;

    private String productid;

    private String bigtype;

    private String smalltype;

    private String subclass;

    private String remark;

    private String itemsname;

    public Integer getFlowid() {
        return flowid;
    }

    public void setFlowid(Integer flowid) {
        this.flowid = flowid;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

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

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass == null ? null : subclass.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getItemsname() {
        return itemsname;
    }

    public void setItemsname(String itemsname) {
        this.itemsname = itemsname == null ? null : itemsname.trim();
    }
}