package com.zgmall.service.console;



import com.zgmall.model.SysMenuRole;

import java.util.List;

/**
 * Created by zhb on 2017/11/29.
 */
public interface SysMenuRoleService {
    void add(String roleId, List<String> menuList);
    void del(SysMenuRole sysMenuRole);
}
