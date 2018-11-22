package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Pricearea;

public interface PriceareaMapper {
    int insert(Pricearea record);

    int insertSelective(Pricearea record);
}