package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Logtracking;

public interface LogtrackingMapper {
    int insert(Logtracking record);

    int insertSelective(Logtracking record);
}