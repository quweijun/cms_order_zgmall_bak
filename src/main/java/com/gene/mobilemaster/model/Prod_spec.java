package com.gene.mobilemaster.model;

import java.util.Date;

public class Prod_spec {
    private Long id;

    private String productid;

    private String prodColor;

    private String prodSize;

    private String specPhoto;

    private Date edittime;

    private String editor;

    private Integer flag;

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

    public String getProdColor() {
        return prodColor;
    }

    public void setProdColor(String prodColor) {
        this.prodColor = prodColor == null ? null : prodColor.trim();
    }

    public String getProdSize() {
        return prodSize;
    }

    public void setProdSize(String prodSize) {
        this.prodSize = prodSize == null ? null : prodSize.trim();
    }

    public String getSpecPhoto() {
        return specPhoto;
    }

    public void setSpecPhoto(String specPhoto) {
        this.specPhoto = specPhoto == null ? null : specPhoto.trim();
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}