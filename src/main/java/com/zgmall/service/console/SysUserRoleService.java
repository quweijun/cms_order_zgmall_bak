package com.zgmall.service.console;

import com.zgmall.model.SysUserRole;

import java.util.List;

/**
 * Created by zhb on 2017/11/29.
 */
public interface SysUserRoleService {
    void add(String userId, List<String> roleList);
    void del(SysUserRole sysUserRole);
}
