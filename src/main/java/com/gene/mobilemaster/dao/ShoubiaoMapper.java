package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Shoubiao;

public interface ShoubiaoMapper {
    int insert(Shoubiao record);

    int insertSelective(Shoubiao record);
}