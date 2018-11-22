package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Stockintermediate;

public interface StockintermediateMapper {
    int insert(Stockintermediate record);

    int insertSelective(Stockintermediate record);
}