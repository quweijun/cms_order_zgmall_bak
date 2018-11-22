package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Barcode;

public interface BarcodeMapper {
    int insert(Barcode record);

    int insertSelective(Barcode record);
}