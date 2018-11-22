package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Emsstatics;

public interface EmsstaticsMapper {
    int insert(Emsstatics record);

    int insertSelective(Emsstatics record);
}