package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Test_dna;

public interface Test_dnaMapper {
    int insert(Test_dna record);

    int insertSelective(Test_dna record);
}