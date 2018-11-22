package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Allstock;

public interface AllstockMapper {
    int insert(Allstock record);

    int insertSelective(Allstock record);
}