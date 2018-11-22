package com.zgmall.service.console;

import com.zgmall.model.MenuIcon;

import java.util.Map;

/**
 * Created by zhb on 2017/12/4.
 */
public interface MenuIconService {
    Map<String, Object> selectInconAll(String queryIcon);

    void del(MenuIcon menuIcon);

    void add(MenuIcon menuIcon);
}
