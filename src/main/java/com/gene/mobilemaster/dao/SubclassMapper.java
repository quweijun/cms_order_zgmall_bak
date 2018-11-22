package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Subclass;

public interface SubclassMapper {
    int insert(Subclass record);

    int insertSelective(Subclass record);
}