package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Exceluploadlog;

public interface ExceluploadlogMapper {
    int insert(Exceluploadlog record);

    int insertSelective(Exceluploadlog record);
}