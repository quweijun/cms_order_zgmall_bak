package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Reqlog;

public interface ReqlogMapper {
    int insert(Reqlog record);

    int insertSelective(Reqlog record);
}