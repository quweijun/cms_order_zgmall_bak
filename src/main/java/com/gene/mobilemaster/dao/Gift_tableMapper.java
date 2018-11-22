package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Gift_table;

public interface Gift_tableMapper {
    int insert(Gift_table record);

    int insertSelective(Gift_table record);
}