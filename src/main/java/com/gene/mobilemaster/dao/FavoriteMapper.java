package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Favorite;

public interface FavoriteMapper {
    int insert(Favorite record);

    int insertSelective(Favorite record);
}