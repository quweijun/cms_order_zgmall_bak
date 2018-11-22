package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Dtproperties;

public interface DtpropertiesMapper {
    int insert(Dtproperties record);

    int insertSelective(Dtproperties record);
}