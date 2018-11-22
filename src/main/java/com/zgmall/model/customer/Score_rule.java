package com.zgmall.model.customer;
import javax.persistence.Id;

public class Score_rule {
    @Id
    private int scoreRuleId;

    private String actionDesc;

    private Integer score;

    private String operation;

    public int getScoreRuleId() {
        return scoreRuleId;
    }

    public void setScoreRuleId(int scoreRuleId) {
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