package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Tmpiplib;

public interface TmpiplibMapper {
    int insert(Tmpiplib record);

    int insertSelective(Tmpiplib record);
}