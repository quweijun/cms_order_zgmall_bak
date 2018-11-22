package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Hdtable;

public interface HdtableMapper {
    int insert(Hdtable record);

    int insertSelective(Hdtable record);
}