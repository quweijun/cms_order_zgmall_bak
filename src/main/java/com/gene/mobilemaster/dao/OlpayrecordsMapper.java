package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Olpayrecords;

public interface OlpayrecordsMapper {
    int insert(Olpayrecords record);

    int insertSelective(Olpayrecords record);
}