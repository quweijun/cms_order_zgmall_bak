package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Specifications;

public interface SpecificationsMapper {
    int insert(Specifications record);

    int insertSelective(Specifications record);
}