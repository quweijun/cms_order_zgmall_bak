package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Phonelist;

public interface PhonelistMapper {
    int insert(Phonelist record);

    int insertSelective(Phonelist record);
}