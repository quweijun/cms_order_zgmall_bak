package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Orderstate;

public interface OrderstateMapper {
    int insert(Orderstate record);

    int insertSelective(Orderstate record);
}