package com.zgmall.mapper.consoledb;

import com.zgmall.config.mybatis.MyMapper;
import com.zgmall.model.SysMenu;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("SysMenuMapper")
public interface SysMenuMapper extends MyMapper<SysMenu> {
    List<Map<String,Object>> selectAllPerms();

    List<Map<String,Object>> selectMenuRole(String roleId);

    List<Map<String,Object>> selectMenuAndParent(SysMenu sysMenu);

    List<SysMenu> selectParentMenu(SysMenu sysMenu);

    List<SysMenu> selectUserPerms(String userId);

}
