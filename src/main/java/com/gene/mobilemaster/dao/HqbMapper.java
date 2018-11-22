package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Hqb;

public interface HqbMapper {
    int insert(Hqb record);

    int insertSelective(Hqb record);
}