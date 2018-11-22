package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Browserecorder;

public interface BrowserecorderMapper {
    int insert(Browserecorder record);

    int insertSelective(Browserecorder record);
}