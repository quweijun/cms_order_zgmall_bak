package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Sp_code;

public interface Sp_codeMapper {
    int insert(Sp_code record);

    int insertSelective(Sp_code record);
}