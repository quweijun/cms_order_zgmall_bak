package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Sensitive_table;

public interface Sensitive_tableMapper {
    int insert(Sensitive_table record);

    int insertSelective(Sensitive_table record);
}