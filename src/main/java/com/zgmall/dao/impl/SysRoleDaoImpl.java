package com.zgmall.dao.impl;

import com.zgmall.dao.SysRoleDao;
import com.zgmall.mapper.consoledb.SysRoleMapper;
import com.zgmall.mapper.consoledb.SysUserRoleMapper;
import com.zgmall.model.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;

/**
 * Created by zhb on 2017/11/28.
 */
@Service("sysRoleDao")
public class SysRoleDaoImpl implements SysRoleDao {
    @Autowired
    SysRoleMapper sysRoleMapper;
    @Autowired
    SysUserRoleMapper sysUserRoleMapper;
    @Override
    public List<SysRole> selectUserRole(String uuid) {
        return sysRoleMapper.selectUserRole(uuid);
    }

    @Override
    public List<SysRole> selectRole() {
        Example example = new Example(SysRole.class);
        example.createCriteria().andCondition("state= ",1);
        return sysRoleMapper.selectByExample(example);
    }

    @Override
    public List<Map<String, Object>> selectAllRole(String roleName) {

        return sysRoleMapper.selectAllRole(roleName);
    }

    @Override
    public void insert(SysRole sysRole) {
          sysRoleMapper.insert(sysRole);
    }

    @Override
    public void update(SysRole sysRole) {
        Example example = new Example(SysRole.class);
        example.createCriteria().andCondition("uuid= ",sysRole.getUuid());
        sysRoleMapper.updateByExampleSelective(sysRole,example);
    }

    @Override
    public void del(SysRole sysRole) {
        sysRoleMapper.delete(sysRole);
    }

}
