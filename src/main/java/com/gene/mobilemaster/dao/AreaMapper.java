package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Area;

public interface AreaMapper {
    int insert(Area record);

    int insertSelective(Area record);
}