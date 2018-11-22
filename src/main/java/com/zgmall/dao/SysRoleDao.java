package com.zgmall.dao;

import com.zgmall.model.SysRole;
import com.zgmall.model.SysUserRole;
import com.zgmall.model.SysRole;

import java.util.List;
import java.util.Map;

/**
 * Created by zhb on 2017/11/28.
 */
public interface SysRoleDao {
    List<SysRole> selectUserRole(String uuid);

    List<SysRole> selectRole();

    List<Map<String,Object>> selectAllRole(String roleName);

    void insert(SysRole sysRole);

    void update(SysRole sysRole);

    void del(SysRole sysRole);
}
