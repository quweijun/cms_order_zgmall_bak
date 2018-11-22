package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Shipmentslog;

public interface ShipmentslogMapper {
    int insert(Shipmentslog record);

    int insertSelective(Shipmentslog record);
}