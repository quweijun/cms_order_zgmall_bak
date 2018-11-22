package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Expressinfomation;

public interface ExpressinfomationMapper {
    int insert(Expressinfomation record);

    int insertSelective(Expressinfomation record);
}