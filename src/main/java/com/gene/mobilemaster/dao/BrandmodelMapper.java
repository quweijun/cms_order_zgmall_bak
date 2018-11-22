package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Brandmodel;

public interface BrandmodelMapper {
    int insert(Brandmodel record);

    int insertSelective(Brandmodel record);
}