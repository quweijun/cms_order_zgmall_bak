package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Mobilebank;

public interface MobilebankMapper {
    int insert(Mobilebank record);

    int insertSelective(Mobilebank record);
}