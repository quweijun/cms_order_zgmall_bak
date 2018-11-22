package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Zguserinfo;

public interface ZguserinfoMapper {
    int insert(Zguserinfo record);

    int insertSelective(Zguserinfo record);
}