package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Jxtable;

public interface JxtableMapper {
    int insert(Jxtable record);

    int insertSelective(Jxtable record);
}