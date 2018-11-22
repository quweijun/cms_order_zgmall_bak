package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Channelsum;

public interface ChannelsumMapper {
    int insert(Channelsum record);

    int insertSelective(Channelsum record);
}