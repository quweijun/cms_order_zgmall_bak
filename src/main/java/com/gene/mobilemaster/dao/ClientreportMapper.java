package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Clientreport;

public interface ClientreportMapper {
    int insert(Clientreport record);

    int insertSelective(Clientreport record);
}