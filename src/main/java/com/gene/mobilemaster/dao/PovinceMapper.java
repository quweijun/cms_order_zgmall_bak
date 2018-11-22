package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Povince;

public interface PovinceMapper {
    int insert(Povince record);

    int insertSelective(Povince record);
}