package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Sp_storage;

public interface Sp_storageMapper {
    int insert(Sp_storage record);

    int insertSelective(Sp_storage record);
}