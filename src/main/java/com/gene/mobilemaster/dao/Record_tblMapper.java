package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Record_tbl;

public interface Record_tblMapper {
    int insert(Record_tbl record);

    int insertSelective(Record_tbl record);
}