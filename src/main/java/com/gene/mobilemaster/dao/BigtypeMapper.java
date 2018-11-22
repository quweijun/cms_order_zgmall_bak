package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Bigtype;

public interface BigtypeMapper {
    int insert(Bigtype record);

    int insertSelective(Bigtype record);
}