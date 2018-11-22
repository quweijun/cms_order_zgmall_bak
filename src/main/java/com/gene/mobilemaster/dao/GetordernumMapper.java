package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Getordernum;

public interface GetordernumMapper {
    int insert(Getordernum record);

    int insertSelective(Getordernum record);
}