package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Operationlog;

public interface OperationlogMapper {
    int insert(Operationlog record);

    int insertSelective(Operationlog record);
}