package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Rejection;

public interface RejectionMapper {
    int insert(Rejection record);

    int insertSelective(Rejection record);
}