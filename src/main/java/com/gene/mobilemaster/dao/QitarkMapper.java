package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Qitark;

public interface QitarkMapper {
    int insert(Qitark record);

    int insertSelective(Qitark record);
}