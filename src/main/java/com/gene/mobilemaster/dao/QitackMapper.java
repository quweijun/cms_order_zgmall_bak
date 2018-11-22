package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Qitack;

public interface QitackMapper {
    int insert(Qitack record);

    int insertSelective(Qitack record);
}