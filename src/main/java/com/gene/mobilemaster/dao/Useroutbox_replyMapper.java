package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Useroutbox_reply;

public interface Useroutbox_replyMapper {
    int insert(Useroutbox_reply record);

    int insertSelective(Useroutbox_reply record);
}