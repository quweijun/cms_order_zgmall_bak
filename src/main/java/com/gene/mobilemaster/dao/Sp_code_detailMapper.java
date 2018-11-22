package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Sp_code_detail;

public interface Sp_code_detailMapper {
    int insert(Sp_code_detail record);

    int insertSelective(Sp_code_detail record);
}