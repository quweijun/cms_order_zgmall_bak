package com.gene.mobilemaster.model;

public class Score_rule {
    private Long scoreRuleId;

    private String actionDesc;

    private Integer score;

    private String operation;

    public Long getScoreRuleId() {
        return scoreRuleId;
    }

    public void setScoreRuleId(Long scoreRuleId) {
        this.scoreRuleId = scoreRuleId;
    }

    public String getActionDesc() {
        return actionDesc;
    }

    public void setActionDesc(String actionDesc) {
        this.actionDesc = actionDesc == null ? null : actionDesc.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }
}