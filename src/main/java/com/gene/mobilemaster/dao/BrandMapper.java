package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Brand;

public interface BrandMapper {
    int insert(Brand record);

    int insertSelective(Brand record);
}