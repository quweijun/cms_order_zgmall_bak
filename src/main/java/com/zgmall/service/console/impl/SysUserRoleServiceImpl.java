package com.zgmall.service.console.impl;

import com.zgmall.dao.SysUserRoleDao;
import com.zgmall.model.SysUserRole;
import com.zgmall.service.console.SysUserRoleService;
import com.zgmall.common.util.CommUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhb on 2017/11/29.
 */
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl implements SysUserRoleService {
    @Autowired
    SysUserRoleDao sysUserRoleDao;

    @Override
    @Transactional
    public void add(String userId, List<String> roleList) {
        SysUserRole sysUserRole1 = new SysUserRole();
        sysUserRole1.setUserId(userId);
        del(sysUserRole1);
        if(roleList.size()>0 && roleList!=null){
            List<SysUserRole> sysUserRoleList = new ArrayList<>();
            for (String roleId : roleList) {
                SysUserRole sysUserRole = new SysUserRole();
                sysUserRole.setUuid(CommUtil.generateUUID());
                sysUserRole.setRoleId(roleId);
                sysUserRole.setUserId(userId);
                sysUserRoleList.add(sysUserRole);
            }
            sysUserRoleDao.add(sysUserRoleList);
        }
    }

    @Override
    public void del(SysUserRole sysUserRole) {
        sysUserRoleDao.del(sysUserRole);
    }

}
