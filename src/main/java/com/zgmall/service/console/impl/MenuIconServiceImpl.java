package com.zgmall.service.console.impl;

import com.github.pagehelper.PageInfo;
import com.zgmall.dao.MenuIconDao;
import com.zgmall.model.MenuIcon;
import com.zgmall.service.console.MenuIconService;
import com.zgmall.common.util.CommUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhb on 2017/12/4.
 */
@Service("menuIconService")
public class MenuIconServiceImpl implements MenuIconService {
    @Autowired
    MenuIconDao menuIconDao;

    @Override
    public Map<String, Object> selectInconAll(String queryIcon) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        List<MenuIcon> menuIconList;
        if (queryIcon==null || queryIcon.trim().equals("")) {
            menuIconList = menuIconDao.selectInconAll();
            System.out.println("no queryIcon");
        }
        else {
            menuIconList=menuIconDao.QueryIncon(queryIcon);
            System.out.println("queryIcon");
        }
        PageInfo pageInfo = new PageInfo<>(menuIconList);
        resultMap.put("pageInfo", pageInfo);
        return resultMap;
    }

    @Override
    public void del(MenuIcon menuIcon) {
        menuIconDao.del(menuIcon);
    }

    @Override
    public void add(MenuIcon menuIcon) {
        menuIcon.setUuid(CommUtil.generateUUID());
        menuIcon.setTime(CommUtil.getNowTime());
        menuIconDao.add(menuIcon);
    }
}
