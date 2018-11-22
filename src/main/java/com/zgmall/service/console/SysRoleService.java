package com.zgmall.service.console;

import com.zgmall.vo.RoleVo;
import com.zgmall.vo.RoleVo;

import java.util.List;
import java.util.Map;

/**
 * Created by zhb on 2017/11/28.
 */
public interface SysRoleService  {
    Map<String, Object> selectUserRole(String uuid);

    Map<String, Object> selectRole();

    Map<String, Object> selectAllRole(RoleVo roleVo);

    void insert(RoleVo roleVo);

    void update(RoleVo roleVo);

    void del(String uuid);
}
