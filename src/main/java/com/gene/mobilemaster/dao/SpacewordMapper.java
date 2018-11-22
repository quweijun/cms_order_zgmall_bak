package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Spaceword;

public interface SpacewordMapper {
    int insert(Spaceword record);

    int insertSelective(Spaceword record);
}