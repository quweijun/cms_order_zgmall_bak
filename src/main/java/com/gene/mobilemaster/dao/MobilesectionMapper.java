package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Mobilesection;

public interface MobilesectionMapper {
    int insert(Mobilesection record);

    int insertSelective(Mobilesection record);
}