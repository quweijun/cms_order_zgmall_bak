package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Prodreplog;

public interface ProdreplogMapper {
    int insert(Prodreplog record);

    int insertSelective(Prodreplog record);
}