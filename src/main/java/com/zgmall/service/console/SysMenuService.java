package com.zgmall.service.console;

import com.zgmall.model.SysMenu;
import com.zgmall.model.SysUser;
import com.zgmall.vo.MenuVo;
import com.zgmall.vo.MenuVo;

import java.util.Map;
import java.util.Set;

public interface SysMenuService {
    Set<String> selectAllPerms(SysUser sysUser);

    Map<String, Object> selectMenuUser();

    Map<String, Object> selectMenuRole(String roleId);

    Map<String, Object> selectAllMenuTree();


    Map<String, Object> selectMenuAll(MenuVo menuVo);

    Map<String, Object> selectParentMenu(SysMenu sysMenu);

    void add(SysMenu sysMenu);

    void update(SysMenu sysMenu);

    void del(String uuid);

}
