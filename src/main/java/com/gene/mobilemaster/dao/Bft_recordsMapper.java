package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Bft_records;

public interface Bft_recordsMapper {
    int insert(Bft_records record);

    int insertSelective(Bft_records record);
}