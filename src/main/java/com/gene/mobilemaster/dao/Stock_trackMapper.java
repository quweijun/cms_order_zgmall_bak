package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Stock_track;

public interface Stock_trackMapper {
    int insert(Stock_track record);

    int insertSelective(Stock_track record);
}