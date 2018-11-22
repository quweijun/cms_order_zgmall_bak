package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Branddict;

public interface BranddictMapper {
    int insert(Branddict record);

    int insertSelective(Branddict record);
}