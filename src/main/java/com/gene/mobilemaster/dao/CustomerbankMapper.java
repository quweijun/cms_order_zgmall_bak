package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Customerbank;

public interface CustomerbankMapper {
    int insert(Customerbank record);

    int insertSelective(Customerbank record);
}