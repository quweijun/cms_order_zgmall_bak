package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Channelcount;

public interface ChannelcountMapper {
    int insert(Channelcount record);

    int insertSelective(Channelcount record);
}