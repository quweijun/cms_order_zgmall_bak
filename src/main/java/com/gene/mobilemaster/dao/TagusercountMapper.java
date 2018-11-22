package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Tagusercount;

public interface TagusercountMapper {
    int insert(Tagusercount record);

    int insertSelective(Tagusercount record);
}