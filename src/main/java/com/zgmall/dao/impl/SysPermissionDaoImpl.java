package com.zgmall.dao.impl;

import com.zgmall.dao.SysPermissionDao;
import com.zgmall.mapper.consoledb.SysPermissionInitMapper;
import com.zgmall.model.SysPermissionInit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

@Service("sysPermissionDao")
public class SysPermissionDaoImpl implements SysPermissionDao {
    @Autowired
    SysPermissionInitMapper sysPermissionInitMapper;
    @Override
    public List<SysPermissionInit> getSysPermissionInitAll() {
        Example example = new Example(SysPermissionInit.class);
        example.createCriteria().andCondition("state= ",1);
        example.setOrderByClause("sort ASC");
        return sysPermissionInitMapper.selectByExample(example);
    }
}
