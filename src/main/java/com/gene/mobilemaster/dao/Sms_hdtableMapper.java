package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Sms_hdtable;

public interface Sms_hdtableMapper {
    int insert(Sms_hdtable record);

    int insertSelective(Sms_hdtable record);
}