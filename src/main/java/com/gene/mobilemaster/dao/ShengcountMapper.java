package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Shengcount;

public interface ShengcountMapper {
    int insert(Shengcount record);

    int insertSelective(Shengcount record);
}