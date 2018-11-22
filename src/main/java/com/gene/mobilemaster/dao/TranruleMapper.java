package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Tranrule;

public interface TranruleMapper {
    int insert(Tranrule record);

    int insertSelective(Tranrule record);
}