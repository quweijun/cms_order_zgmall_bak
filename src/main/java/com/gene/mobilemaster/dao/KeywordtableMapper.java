package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Keywordtable;

public interface KeywordtableMapper {
    int insert(Keywordtable record);

    int insertSelective(Keywordtable record);
}