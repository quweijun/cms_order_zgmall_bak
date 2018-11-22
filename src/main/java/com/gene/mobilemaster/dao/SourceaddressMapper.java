package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Sourceaddress;

public interface SourceaddressMapper {
    int insert(Sourceaddress record);

    int insertSelective(Sourceaddress record);
}