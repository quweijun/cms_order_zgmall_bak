package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Paylist;

public interface PaylistMapper {
    int insert(Paylist record);

    int insertSelective(Paylist record);
}