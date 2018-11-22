package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Saleslog;

public interface SaleslogMapper {
    int insert(Saleslog record);

    int insertSelective(Saleslog record);
}