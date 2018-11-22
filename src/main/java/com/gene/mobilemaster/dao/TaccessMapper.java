package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Taccess;

public interface TaccessMapper {
    int insert(Taccess record);

    int insertSelective(Taccess record);
}