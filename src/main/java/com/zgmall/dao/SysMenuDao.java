package com.zgmall.dao;

import com.zgmall.model.SysMenu;
import com.zgmall.vo.MenuVo;

import java.util.List;
import java.util.Map;

public interface SysMenuDao {

    List<Map<String,Object>> selectMenuRole(String roleId);

    List<Map<String,Object>> selectMenuAndParent(SysMenu sysMenu);

    List<SysMenu> selectAllMenu();

    List<SysMenu> selectParentMenu(SysMenu sysMenu);

    void del(SysMenu sysMenu);

    void update(SysMenu sysMenu);

    void add(SysMenu sysMenu);

    List<SysMenu> selectUserPerms(String userId);


}
