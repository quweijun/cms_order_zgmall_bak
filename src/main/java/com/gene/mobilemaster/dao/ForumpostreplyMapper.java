package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Forumpostreply;

public interface ForumpostreplyMapper {
    int insert(Forumpostreply record);

    int insertSelective(Forumpostreply record);
}