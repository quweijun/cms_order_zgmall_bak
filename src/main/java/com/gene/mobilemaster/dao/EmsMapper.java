package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Ems;

public interface EmsMapper {
    int insert(Ems record);

    int insertSelective(Ems record);
}