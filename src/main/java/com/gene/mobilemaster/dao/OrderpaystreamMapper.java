package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Orderpaystream;

public interface OrderpaystreamMapper {
    int insert(Orderpaystream record);

    int insertSelective(Orderpaystream record);
}