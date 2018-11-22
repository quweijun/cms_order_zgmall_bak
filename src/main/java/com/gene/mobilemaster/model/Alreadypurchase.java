package com.gene.mobilemaster.model;

import java.util.Date;

public class Alreadypurchase {
    private String aggergatedate;

    private Integer numerical;

    private Integer costume;

    private Integer ornament;

    private Integer brain;

    private Integer livelihood;

    private Integer nurse;

    private Integer present;

    private Integer synthesis;

    private Date handledate;

    public String getAggergatedate() {
        return aggergatedate;
    }

    public void setAggergatedate(String aggergatedate) {
        this.aggergatedate = aggergatedate == null ? null : aggergatedate.trim();
    }

    public Integer getNumerical() {
        return numerical;
    }

    public void setNumerical(Integer numerical) {
        this.numerical = numerical;
    }

    public Integer getCostume() {
        return costume;
    }

    public void setCostume(Integer costume) {
        this.costume = costume;
    }

    public Integer getOrnament() {
        return ornament;
    }

    public void setOrnament(Integer ornament) {
        this.ornament = ornament;
    }

    public Integer getBrain() {
        return brain;
    }

    public void setBrain(Integer brain) {
        this.brain = brain;
    }

    public Integer getLivelihood() {
        return livelihood;
    }

    public void setLivelihood(Integer livelihood) {
        this.livelihood = livelihood;
    }

    public Integer getNurse() {
        return nurse;
    }

    public void setNurse(Integer nurse) {
        this.nurse = nurse;
    }

    public Integer getPresent() {
        return present;
    }

    public void setPresent(Integer present) {
        this.present = present;
    }

    public Integer getSynthesis() {
        return synthesis;
    }

    public void setSynthesis(Integer synthesis) {
        this.synthesis = synthesis;
    }

    public Date getHandledate() {
        return handledate;
    }

    public void setHandledate(Date handledate) {
        this.handledate = handledate;
    }
}