package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Prodinfo;

public interface ProdinfoMapper {
    int insert(Prodinfo record);

    int insertSelective(Prodinfo record);
}