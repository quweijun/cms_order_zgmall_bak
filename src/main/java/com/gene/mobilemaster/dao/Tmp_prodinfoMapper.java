package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Tmp_prodinfo;

public interface Tmp_prodinfoMapper {
    int insert(Tmp_prodinfo record);

    int insertSelective(Tmp_prodinfo record);
}