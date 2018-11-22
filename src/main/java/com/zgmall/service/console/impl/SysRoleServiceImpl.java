package com.zgmall.service.console.impl;

import com.github.pagehelper.PageInfo;
import com.zgmall.dao.SysRoleDao;
import com.zgmall.model.SysMenuRole;
import com.zgmall.model.SysRole;
import com.zgmall.model.SysUser;
import com.zgmall.model.SysUserRole;
import com.zgmall.service.console.SysMenuRoleService;
import com.zgmall.service.console.SysRoleService;
import com.zgmall.service.console.SysUserRoleService;
import com.zgmall.common.util.CommUtil;
import com.zgmall.vo.RoleVo;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    SysRoleDao sysRoleDao;
    @Autowired
    SysMenuRoleService sysMenuRoleService;
    @Autowired
    SysUserRoleService sysUserRoleService;

    @Override
    public Map<String, Object> selectUserRole(String uuid) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        List<SysRole> sysRoleList = sysRoleDao.selectUserRole(uuid);
        resultMap.put("roleList", sysRoleList);
        return resultMap;
    }

    @Override
    public Map<String, Object> selectRole() {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        List<SysRole> sysRoleList = sysRoleDao.selectRole();
        resultMap.put("roleList", sysRoleList);
        return resultMap;
    }

    @Override
    public Map<String, Object> selectAllRole(RoleVo role) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        List<Map<String, Object>> roleMapList = sysRoleDao.selectAllRole(role.getRoleName());
        List<RoleVo> roleList = new ArrayList<>();
        for (Map<String, Object> item : roleMapList) {
            RoleVo roleVo = new RoleVo();
            roleVo.setTime(Integer.parseInt(item.get("time").toString()));
            roleVo.setUuid(CommUtil.retrunObject(item.get("uuid")));
            roleVo.setState(Integer.parseInt(item.get("state").toString()));
            roleVo.setCreateName(CommUtil.retrunObject(item.get("createName")));
            roleVo.setRoleCode(CommUtil.retrunObject(item.get("role_code")));
            roleVo.setRoleName(CommUtil.retrunObject(item.get("role_name")));
            roleVo.setRoleRemark(CommUtil.retrunObject(item.get("role_remark")));
            roleList.add(roleVo);
        }
        PageInfo pageInfo = new PageInfo<>(roleMapList);
        resultMap.put("pageInfo", pageInfo);
        resultMap.put("roleList", roleList);
        return resultMap;
    }

    @Override
    @Transactional
    public void insert(RoleVo roleVo) {
        SysRole sysRole = new SysRole();
        String uuid = CommUtil.generateUUID();
        sysRole.setUuid(uuid);
        sysRole.setRoleName(roleVo.getRoleName());
        sysRole.setRoleRemark(roleVo.getRoleRemark());
        sysRole.setRoleCode(roleVo.getRoleCode());
        sysRole.setTime(CommUtil.getNowTime());
        sysRole.setCreateUser(((SysUser) SecurityUtils.getSubject().getPrincipal()).getUuid());
        sysRole.setState(0);
        sysRoleDao.insert(sysRole);
        sysMenuRoleService.add(uuid, roleVo.getMenuList());

    }

    @Override
    @Transactional
    public void update(RoleVo roleVo) {
        SysRole sysRole = new SysRole();
        sysRole.setUuid(roleVo.getUuid());
        if (roleVo.getState() == null) {
            sysRole.setRoleName(roleVo.getRoleName());
            sysRole.setRoleRemark(roleVo.getRoleRemark());
            sysRole.setRoleCode(roleVo.getRoleCode());
            sysRole.setTime(CommUtil.getNowTime());
            sysMenuRoleService.add(roleVo.getUuid(), roleVo.getMenuList());
        } else {
            sysRole.setState(roleVo.getState());
        }
        sysRoleDao.update(sysRole);
    }

    @Override
    @Transactional
    public void del(String uuid) {
        SysRole sysRole = new SysRole();
        sysRole.setUuid(uuid);
        sysRoleDao.del(sysRole);
        SysMenuRole sysMenuRole = new SysMenuRole();
        sysMenuRole.setRoleId(uuid);
        sysMenuRoleService.del(sysMenuRole);
        SysUserRole sysUserRole = new SysUserRole();
        sysUserRole.setRoleId(uuid);
        sysUserRoleService.del(sysUserRole);
    }
}
