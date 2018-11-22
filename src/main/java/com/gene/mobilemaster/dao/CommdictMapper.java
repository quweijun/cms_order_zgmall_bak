package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Commdict;

public interface CommdictMapper {
    int insert(Commdict record);

    int insertSelective(Commdict record);
}