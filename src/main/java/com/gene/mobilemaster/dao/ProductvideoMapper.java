package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Productvideo;

public interface ProductvideoMapper {
    int insert(Productvideo record);

    int insertSelective(Productvideo record);
}