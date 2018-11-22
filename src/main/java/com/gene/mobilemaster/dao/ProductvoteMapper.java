package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Productvote;

public interface ProductvoteMapper {
    int insert(Productvote record);

    int insertSelective(Productvote record);
}