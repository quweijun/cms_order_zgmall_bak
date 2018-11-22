package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Shopcat;

public interface ShopcatMapper {
    int insert(Shopcat record);

    int insertSelective(Shopcat record);
}