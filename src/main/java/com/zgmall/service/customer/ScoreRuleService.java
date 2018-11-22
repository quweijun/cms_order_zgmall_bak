package com.zgmall.service.customer;

import com.zgmall.model.customer.Score_rule;

import java.util.Map;

public interface ScoreRuleService {
    Map<String, Object> selectScoreRuleList(Score_rule score_rule);

    void add(Score_rule score_rule);

    void update(Score_rule score_rule);

    void del(Score_rule score_rule);
}
