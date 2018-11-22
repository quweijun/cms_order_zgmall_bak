package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Mobilelib;

public interface MobilelibMapper {
    int insert(Mobilelib record);

    int insertSelective(Mobilelib record);
}