package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Phototype;

public interface PhototypeMapper {
    int insert(Phototype record);

    int insertSelective(Phototype record);
}