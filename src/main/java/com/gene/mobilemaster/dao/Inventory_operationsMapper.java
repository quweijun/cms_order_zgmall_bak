package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Inventory_operations;

public interface Inventory_operationsMapper {
    int insert(Inventory_operations record);

    int insertSelective(Inventory_operations record);
}