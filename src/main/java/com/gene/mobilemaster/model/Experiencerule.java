package com.gene.mobilemaster.model;

import java.util.Date;

public class Experiencerule {
    private Long experienceid;

    private String operation;

    private Integer exprience;

    private Integer maxexprience;

    private String exdesc;

    private String editor;

    private Date addtime;

    private Integer flag;

    public Long getExperienceid() {
        return experienceid;
    }

    public void setExperienceid(Long experienceid) {
        this.experienceid = experienceid;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public Integer getExprience() {
        return exprience;
    }

    public void setExprience(Integer exprience) {
        this.exprience = exprience;
    }

    public Integer getMaxexprience() {
        return maxexprience;
    }

    public void setMaxexprience(Integer maxexprience) {
        this.maxexprience = maxexprience;
    }

    public String getExdesc() {
        return exdesc;
    }

    public void setExdesc(String exdesc) {
        this.exdesc = exdesc == null ? null : exdesc.trim();
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

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}