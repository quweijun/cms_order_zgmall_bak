package com.zgmall.dao;

import com.zgmall.model.SysUser;
import com.zgmall.model.SysUserRole;
import com.zgmall.model.SysUserRole;

import java.util.List;

/**
 * Created by zhb on 2017/11/29.
 */
public interface SysUserRoleDao {
    void add(List<SysUserRole> sysUserRoleList);

    void del(SysUserRole sysUserRole);

}
