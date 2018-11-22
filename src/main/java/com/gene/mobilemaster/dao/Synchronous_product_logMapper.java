package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Synchronous_product_log;

public interface Synchronous_product_logMapper {
    int insert(Synchronous_product_log record);

    int insertSelective(Synchronous_product_log record);
}