package com.gene.mobilemaster.model;

public class Type_tbl {
    private Integer id;

    private Integer typeid;

    private String typename;

    private Integer typemoduleid;

    private Integer moduleid;

    private String modulename;

    private String ruleone;

    private String ruletwo;

    private String rulethree;

    private String rulefour;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getTypemoduleid() {
        return typemoduleid;
    }

    public void setTypemoduleid(Integer typemoduleid) {
        this.typemoduleid = typemoduleid;
    }

    public Integer getModuleid() {
        return moduleid;
    }

    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename == null ? null : modulename.trim();
    }

    public String getRuleone() {
        return ruleone;
    }

    public void setRuleone(String ruleone) {
        this.ruleone = ruleone == null ? null : ruleone.trim();
    }

    public String getRuletwo() {
        return ruletwo;
    }

    public void setRuletwo(String ruletwo) {
        this.ruletwo = ruletwo == null ? null : ruletwo.trim();
    }

    public String getRulethree() {
        return rulethree;
    }

    public void setRulethree(String rulethree) {
        this.rulethree = rulethree == null ? null : rulethree.trim();
    }

    public String getRulefour() {
        return rulefour;
    }

    public void setRulefour(String rulefour) {
        this.rulefour = rulefour == null ? null : rulefour.trim();
    }
}