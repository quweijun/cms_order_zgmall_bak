package com.gene.mobilemaster.model;

import java.util.Date;

public class Channelnews {
    private Integer flowid;

    private String operater;

    private Integer contenttype;

    private String title;

    private Date addtime;

    private Integer isenable;

    private String lastuptor;

    private Date lastupttime;

    private String content;

    public Integer getFlowid() {
        return flowid;
    }

    public void setFlowid(Integer flowid) {
        this.flowid = flowid;
    }

    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater == null ? null : operater.trim();
    }

    public Integer getContenttype() {
        return contenttype;
    }

    public void setContenttype(Integer contenttype) {
        this.contenttype = contenttype;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getIsenable() {
        return isenable;
    }

    public void setIsenable(Integer isenable) {
        this.isenable = isenable;
    }

    public String getLastuptor() {
        return lastuptor;
    }

    public void setLastuptor(String lastuptor) {
        this.lastuptor = lastuptor == null ? null : lastuptor.trim();
    }

    public Date getLastupttime() {
        return lastupttime;
    }

    public void setLastupttime(Date lastupttime) {
        this.lastupttime = lastupttime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}