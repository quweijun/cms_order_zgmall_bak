package com.zgmall.dao;

import com.zgmall.model.SysMenuRole;
import com.zgmall.model.SysRole;
import com.zgmall.model.SysMenuRole;

import java.util.List;

/**
 * Created by zhb on 2017/11/29.
 */
public interface SysMenuRoleDao {
    void add(List<SysMenuRole> sysMenuRoleList);

    void del(SysMenuRole sysMenuRole);

}
