package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Score_rule;

public interface Score_ruleMapper {
    int insert(Score_rule record);

    int insertSelective(Score_rule record);
}