package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Ware_records_all;

public interface Ware_records_allMapper {
    int insert(Ware_records_all record);

    int insertSelective(Ware_records_all record);
}