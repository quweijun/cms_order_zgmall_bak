package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Freeproduct;

public interface FreeproductMapper {
    int insert(Freeproduct record);

    int insertSelective(Freeproduct record);
}