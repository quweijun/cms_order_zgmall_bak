package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Colordict;

public interface ColordictMapper {
    int insert(Colordict record);

    int insertSelective(Colordict record);
}