package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Sms_class;

public interface Sms_classMapper {
    int insert(Sms_class record);

    int insertSelective(Sms_class record);
}