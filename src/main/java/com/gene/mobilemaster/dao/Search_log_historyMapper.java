package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Search_log_history;

public interface Search_log_historyMapper {
    int insert(Search_log_history record);

    int insertSelective(Search_log_history record);
}