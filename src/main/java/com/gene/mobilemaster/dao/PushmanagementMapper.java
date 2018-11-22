package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Pushmanagement;

public interface PushmanagementMapper {
    int insert(Pushmanagement record);

    int insertSelective(Pushmanagement record);
}