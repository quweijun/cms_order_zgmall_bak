package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Ubblib;

public interface UbblibMapper {
    int insert(Ubblib record);

    int insertSelective(Ubblib record);
}