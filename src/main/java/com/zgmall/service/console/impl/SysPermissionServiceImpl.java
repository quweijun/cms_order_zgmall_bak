package com.zgmall.service.console.impl;

import com.zgmall.dao.SysPermissionDao;
import com.zgmall.model.SysPermissionInit;
import com.zgmall.service.console.SysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysPermissionService")
public class SysPermissionServiceImpl implements SysPermissionService {
    @Autowired
    SysPermissionDao sysPermissionDao;
    @Override
    public List<SysPermissionInit> getSysPermissionInitAll() {
        return sysPermissionDao.getSysPermissionInitAll();
    }
}
