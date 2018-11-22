package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Wa_l_producttableWithBLOBs;

public interface Wa_l_producttableMapper {
    int insert(Wa_l_producttableWithBLOBs record);

    int insertSelective(Wa_l_producttableWithBLOBs record);
}