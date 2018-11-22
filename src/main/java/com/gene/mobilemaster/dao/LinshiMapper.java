package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Linshi;

public interface LinshiMapper {
    int insert(Linshi record);

    int insertSelective(Linshi record);
}