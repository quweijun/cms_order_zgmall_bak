package com.zgmall.dao.impl;

import com.zgmall.dao.MenuIconDao;
import com.zgmall.mapper.consoledb.MenuIconMapper;
import com.zgmall.model.MenuIcon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by zhb on 2017/12/4.
 */
@Service("menuIconDao")
public class MenuIconDaoImpl implements MenuIconDao {
    @Autowired
    MenuIconMapper menuIconMapper;


    /*
    利用通用Mapper功能获取列表
     */
    @Override
    public List<MenuIcon> selectInconAll() {
        Example example = new Example(MenuIcon.class);
        example.setOrderByClause("time desc");
        return menuIconMapper.selectByExample(example);
    }

    /*
    自定义Mapper方法。
     */
    @Override
    public List<MenuIcon> QueryIncon(String queryIcon) {
        return menuIconMapper.queryIcon(queryIcon);
    }

    @Override
    public void del(MenuIcon menuIcon) {
        menuIconMapper.delete(menuIcon);
    }

    @Override
    public void add(MenuIcon menuIcon) {
        menuIconMapper.insert(menuIcon);
    }
}
