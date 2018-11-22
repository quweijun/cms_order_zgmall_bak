package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Smalltype;

public interface SmalltypeMapper {
    int insert(Smalltype record);

    int insertSelective(Smalltype record);
}