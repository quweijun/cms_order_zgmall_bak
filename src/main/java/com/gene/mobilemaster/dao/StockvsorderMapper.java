package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Stockvsorder;

public interface StockvsorderMapper {
    int insert(Stockvsorder record);

    int insertSelective(Stockvsorder record);
}