package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Everydaystatistics;

public interface EverydaystatisticsMapper {
    int insert(Everydaystatistics record);

    int insertSelective(Everydaystatistics record);
}