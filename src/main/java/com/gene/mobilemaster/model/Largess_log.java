package com.gene.mobilemaster.model;

import java.util.Date;

public class Largess_log {
    private Long flowid;

    private String pjid;

    private String editor;

    private Date addtime;

    private String setstep;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public String getPjid() {
        return pjid;
    }

    public void setPjid(String pjid) {
        this.pjid = pjid == null ? null : pjid.trim();
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

    public String getSetstep() {
        return setstep;
    }

    public void setSetstep(String setstep) {
        this.setstep = setstep == null ? null : setstep.trim();
    }
}