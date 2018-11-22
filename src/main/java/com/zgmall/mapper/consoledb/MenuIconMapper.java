package com.zgmall.mapper.consoledb;

import com.zgmall.config.mybatis.MyMapper;
import com.zgmall.model.MenuIcon;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MenuIconMapper")
public interface MenuIconMapper extends MyMapper<MenuIcon> {
    List<MenuIcon> queryIcon(@Param("queryIconName") String  queryIconName);
}
