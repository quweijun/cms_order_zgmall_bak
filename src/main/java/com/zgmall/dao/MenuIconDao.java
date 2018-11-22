package com.zgmall.dao;

import com.zgmall.model.MenuIcon;
import com.zgmall.model.MenuIcon;

import java.util.List;

/**
 * Created by zhb on 2017/12/4.
 */
public interface MenuIconDao {
    List<MenuIcon> selectInconAll();

    List<MenuIcon> QueryIncon(String queryIcon);

    void del(MenuIcon menuIcon);

    void add(MenuIcon menuIcon);
}
