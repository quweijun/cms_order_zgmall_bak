package com.gene.mobilemaster.model;

import java.util.Date;

public class Productidreplace {
    private Long flowid;

    private String productid;

    private String reproductid;

    private String editor;

    private Date addtime;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getReproductid() {
        return reproductid;
    }

    public void setReproductid(String reproductid) {
        this.reproductid = reproductid == null ? null : reproductid.trim();
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}