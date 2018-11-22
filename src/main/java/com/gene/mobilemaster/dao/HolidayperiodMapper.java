package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Holidayperiod;

public interface HolidayperiodMapper {
    int insert(Holidayperiod record);

    int insertSelective(Holidayperiod record);
}