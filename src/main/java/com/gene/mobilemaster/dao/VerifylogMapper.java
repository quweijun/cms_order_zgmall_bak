package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Verifylog;

public interface VerifylogMapper {
    int insert(Verifylog record);

    int insertSelective(Verifylog record);
}