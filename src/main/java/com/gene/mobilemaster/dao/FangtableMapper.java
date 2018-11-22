package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Fangtable;

public interface FangtableMapper {
    int insert(Fangtable record);

    int insertSelective(Fangtable record);
}