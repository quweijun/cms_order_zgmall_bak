package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Upload_tracking;

public interface Upload_trackingMapper {
    int insert(Upload_tracking record);

    int insertSelective(Upload_tracking record);
}