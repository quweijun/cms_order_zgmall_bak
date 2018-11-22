package com.zgmall.dao;

import com.zgmall.model.SysUser;
import com.zgmall.model.SysUser;

import java.util.List;
import java.util.Map;

public interface SysUserDao {
    SysUser selectAmUserByName(String username);

    List<Map<String,Object>> selectUserAll(String name);

    void add(SysUser sysUser);

    void update(SysUser sysUser);

    void del(SysUser sysUser);
}
