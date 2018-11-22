package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Productnote;

public interface ProductnoteMapper {
    int insert(Productnote record);

    int insertSelective(Productnote record);
}