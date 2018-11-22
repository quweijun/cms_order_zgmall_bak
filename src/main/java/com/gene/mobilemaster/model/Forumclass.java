package com.gene.mobilemaster.model;

import java.util.Date;

public class Forumclass {
    private Integer classid;

    private String classname;

    private String creater;

    private Date adddate;

    private Integer isquestion;

    private Integer islogin;

    private Integer memberGrade;

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public Integer getIsquestion() {
        return isquestion;
    }

    public void setIsquestion(Integer isquestion) {
        this.isquestion = isquestion;
    }

    public Integer getIslogin() {
        return islogin;
    }

    public void setIslogin(Integer islogin) {
        this.islogin = islogin;
    }

    public Integer getMemberGrade() {
        return memberGrade;
    }

    public void setMemberGrade(Integer memberGrade) {
        this.memberGrade = memberGrade;
    }
}