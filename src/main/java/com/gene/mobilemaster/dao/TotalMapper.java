package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Total;

public interface TotalMapper {
    int insert(Total record);

    int insertSelective(Total record);
}