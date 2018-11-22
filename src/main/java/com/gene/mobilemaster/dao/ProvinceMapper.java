package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Province;

public interface ProvinceMapper {
    int insert(Province record);

    int insertSelective(Province record);
}