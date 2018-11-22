package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Customerorder;

public interface CustomerorderMapper {
    int insert(Customerorder record);

    int insertSelective(Customerorder record);
}