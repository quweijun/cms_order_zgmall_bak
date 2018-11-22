package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Ad_table;

public interface Ad_tableMapper {
    int insert(Ad_table record);

    int insertSelective(Ad_table record);
}