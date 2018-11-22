package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Dna;

public interface DnaMapper {
    int insert(Dna record);

    int insertSelective(Dna record);
}