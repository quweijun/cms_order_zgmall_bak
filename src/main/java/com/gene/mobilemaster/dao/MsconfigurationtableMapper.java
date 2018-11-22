package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Msconfigurationtable;

public interface MsconfigurationtableMapper {
    int insert(Msconfigurationtable record);

    int insertSelective(Msconfigurationtable record);
}