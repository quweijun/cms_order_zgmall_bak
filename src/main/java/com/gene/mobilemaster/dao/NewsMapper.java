package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.NewsWithBLOBs;

public interface NewsMapper {
    int insert(NewsWithBLOBs record);

    int insertSelective(NewsWithBLOBs record);
}