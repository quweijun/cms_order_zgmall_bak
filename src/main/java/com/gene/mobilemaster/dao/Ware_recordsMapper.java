package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Ware_records;

public interface Ware_recordsMapper {
    int insert(Ware_records record);

    int insertSelective(Ware_records record);
}