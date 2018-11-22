package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Smsinfo;

public interface SmsinfoMapper {
    int insert(Smsinfo record);

    int insertSelective(Smsinfo record);
}