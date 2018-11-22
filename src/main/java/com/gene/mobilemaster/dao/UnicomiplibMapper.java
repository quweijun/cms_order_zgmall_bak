package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Unicomiplib;

public interface UnicomiplibMapper {
    int insert(Unicomiplib record);

    int insertSelective(Unicomiplib record);
}