package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Beforehand_order;

public interface Beforehand_orderMapper {
    int insert(Beforehand_order record);

    int insertSelective(Beforehand_order record);
}