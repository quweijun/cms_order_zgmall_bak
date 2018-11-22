package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Searchtable;

public interface SearchtableMapper {
    int insert(Searchtable record);

    int insertSelective(Searchtable record);
}