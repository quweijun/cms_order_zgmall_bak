package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Config_pay;

public interface Config_payMapper {
    int insert(Config_pay record);

    int insertSelective(Config_pay record);
}