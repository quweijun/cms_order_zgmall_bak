package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Arealist;

public interface ArealistMapper {
    int insert(Arealist record);

    int insertSelective(Arealist record);
}