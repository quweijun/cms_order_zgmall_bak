package com.zgmall.dao.impl;

import com.zgmall.dao.SysMenuRoleDao;
import com.zgmall.mapper.consoledb.SysMenuRoleMapper;
import com.zgmall.model.SysMenuRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by zhb on 2017/11/29.
 */
@Service("sysMenuRoleDao")
public class SysMenuRoleDaoImpl implements SysMenuRoleDao {
    @Autowired
    SysMenuRoleMapper sysMenuRoleMapper;
    @Override
    public void add(List<SysMenuRole> sysMenuRoleList) {
        sysMenuRoleMapper.insertList(sysMenuRoleList);

    }

    @Override
    public void del(SysMenuRole sysMenuRole) {
        Example example = new Example(SysMenuRole.class);
        if(sysMenuRole.getRoleId()!=null&&!sysMenuRole.getRoleId().equals("")){
            example.createCriteria().andCondition("role_id= ",sysMenuRole.getRoleId());
        }else{
            example.createCriteria().andCondition("menu_id= ",sysMenuRole.getMenuId());
        }
        sysMenuRoleMapper.deleteByExample(example);
    }

}
