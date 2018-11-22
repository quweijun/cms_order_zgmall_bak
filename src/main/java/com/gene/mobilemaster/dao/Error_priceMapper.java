package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Error_price;

public interface Error_priceMapper {
    int insert(Error_price record);

    int insertSelective(Error_price record);
}