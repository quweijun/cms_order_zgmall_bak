package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Prod_spec;

public interface Prod_specMapper {
    int insert(Prod_spec record);

    int insertSelective(Prod_spec record);
}