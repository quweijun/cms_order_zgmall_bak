package com.zgmall.service.console.impl;

import com.github.pagehelper.PageInfo;
import com.zgmall.dao.ButtonAliasDao;
import com.zgmall.model.ButtonAlias;
import com.zgmall.service.console.ButtonAliasService;
import com.zgmall.common.util.CommUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhb on 2017/12/4.
 */
@Service("buttonAliasService")
public class ButtonAliasServiceImpl implements ButtonAliasService {
    @Autowired
    ButtonAliasDao buttonAliasDao;
    @Override
    public void add(ButtonAlias buttonAlias) {
        buttonAlias.setTime(CommUtil.getNowTime());
        buttonAlias.setUuid(CommUtil.generateUUID());
        buttonAliasDao.add(buttonAlias);
    }

    @Override
    public void del(ButtonAlias buttonAlias) {
        buttonAliasDao.del(buttonAlias);
    }

    @Override
    public Map<String, Object> selectAll() {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        List<ButtonAlias> menuIconList = buttonAliasDao.selectAll();
        PageInfo pageInfo = new PageInfo<>(menuIconList);
        resultMap.put("pageInfo", pageInfo);
        return resultMap;
    }
}
