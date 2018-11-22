package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Alreadypurchase;

public interface AlreadypurchaseMapper {
    int insert(Alreadypurchase record);

    int insertSelective(Alreadypurchase record);
}