package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Taocan_product;

public interface Taocan_productMapper {
    int insert(Taocan_product record);

    int insertSelective(Taocan_product record);
}