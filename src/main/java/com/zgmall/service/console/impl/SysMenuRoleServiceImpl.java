package com.zgmall.service.console.impl;

import com.zgmall.dao.SysMenuRoleDao;
import com.zgmall.model.SysMenuRole;
import com.zgmall.service.console.SysMenuRoleService;
import com.zgmall.common.util.CommUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhb on 2017/11/29.
 */
@Service("sysMenuRoleService")
public class SysMenuRoleServiceImpl implements SysMenuRoleService {
    @Autowired
    SysMenuRoleDao sysMenuRoleDao;
    @Override
    public void add(String roleId, List<String> menuList) {
        SysMenuRole sysMenuRole1=new SysMenuRole();
        sysMenuRole1.setRoleId(roleId);
        del(sysMenuRole1);
        if(menuList!=null &&menuList.size()>0) {
            List<SysMenuRole> sysMenuRoleList =new ArrayList<>();
            for (String menuId : menuList) {
                SysMenuRole sysMenuRole = new SysMenuRole();
                sysMenuRole.setUuid(CommUtil.generateUUID());
                sysMenuRole.setMenuId(menuId);
                sysMenuRole.setRoleId(roleId);
                sysMenuRoleList.add(sysMenuRole);
            }
            sysMenuRoleDao.add(sysMenuRoleList);
        }
    }

    @Override
    public void del(SysMenuRole sysMenuRole) {
        sysMenuRoleDao.del(sysMenuRole);
    }

}
