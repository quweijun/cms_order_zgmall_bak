package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Type_tbl;

public interface Type_tblMapper {
    int insert(Type_tbl record);

    int insertSelective(Type_tbl record);
}