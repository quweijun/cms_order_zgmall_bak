package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Orderpv;

public interface OrderpvMapper {
    int insert(Orderpv record);

    int insertSelective(Orderpv record);
}