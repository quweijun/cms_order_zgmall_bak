package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Hdproduct;

public interface HdproductMapper {
    int insert(Hdproduct record);

    int insertSelective(Hdproduct record);
}