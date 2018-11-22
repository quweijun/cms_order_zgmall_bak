package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Orderdesc;

public interface OrderdescMapper {
    int insert(Orderdesc record);

    int insertSelective(Orderdesc record);
}