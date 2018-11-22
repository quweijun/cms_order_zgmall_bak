package com.zgmall.dao.impl;

import com.zgmall.dao.SysUserRoleDao;
import com.zgmall.mapper.consoledb.SysUserRoleMapper;
import com.zgmall.model.SysUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by zhb on 2017/11/29.
 */
@Service("sysUserRoleDao")
public class SysUserRoleDaoImpl implements SysUserRoleDao {
    @Autowired
    SysUserRoleMapper sysUserRoleMapper;

    @Override
    public void add(List<SysUserRole> sysUserRoleList) {
        sysUserRoleMapper.insertList(sysUserRoleList);
    }

    @Override
    public void del(SysUserRole sysUserRole) {
        Example example = new Example(SysUserRole.class);
        if(sysUserRole.getUserId()!=null&&!sysUserRole.getUserId().equals("")){
            example.createCriteria().andCondition("user_id= ",sysUserRole.getUserId());
        }else{
            example.createCriteria().andCondition("role_id= ",sysUserRole.getRoleId());
        }
        sysUserRoleMapper.deleteByExample(example);
    }
}
