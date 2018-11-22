package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Smsinfo_history;

public interface Smsinfo_historyMapper {
    int insert(Smsinfo_history record);

    int insertSelective(Smsinfo_history record);
}