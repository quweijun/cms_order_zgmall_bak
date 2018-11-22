package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Stocktmp;

public interface StocktmpMapper {
    int insert(Stocktmp record);

    int insertSelective(Stocktmp record);
}