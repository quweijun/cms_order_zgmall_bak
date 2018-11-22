package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Appdownrecords;

public interface AppdownrecordsMapper {
    int insert(Appdownrecords record);

    int insertSelective(Appdownrecords record);
}