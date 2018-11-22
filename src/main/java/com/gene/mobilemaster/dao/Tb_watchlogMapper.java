package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Tb_watchlog;

public interface Tb_watchlogMapper {
    int insert(Tb_watchlog record);

    int insertSelective(Tb_watchlog record);
}