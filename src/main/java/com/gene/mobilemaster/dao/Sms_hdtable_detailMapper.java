package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Sms_hdtable_detail;

public interface Sms_hdtable_detailMapper {
    int insert(Sms_hdtable_detail record);

    int insertSelective(Sms_hdtable_detail record);
}