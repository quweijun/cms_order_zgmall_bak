package com.zgmall.service.console.impl;

import com.github.pagehelper.PageInfo;
import com.zgmall.dao.SysUserDao;
import com.zgmall.model.SysUser;
import com.zgmall.model.SysUserRole;
import com.zgmall.service.console.SysUserRoleService;
import com.zgmall.service.console.SysUserService;
import com.zgmall.common.util.CommUtil;
import com.zgmall.vo.UserVo;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    SysUserDao sysUserDao;
    @Autowired
    SysUserRoleService sysUserRoleService;

    @Override
    public SysUser selectAmUserByName(String username) {
        return sysUserDao.selectAmUserByName(username);
    }

    @Override
    public Map<String, Object> selectUserAll(UserVo user) {
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<Map<String, Object>> userMapList = sysUserDao.selectUserAll(user.getUserName());
        List<UserVo> userList = new ArrayList<>();
        for (Map<String, Object> item : userMapList) {
            UserVo userVo = new UserVo();
            userVo.setTime(Integer.parseInt(item.get("time").toString()));
            userVo.setState(Integer.parseInt(item.get("state").toString()));
            userVo.setCreateUser(CommUtil.retrunObject(item.get("createName")));
            userVo.setEmail(CommUtil.retrunObject(item.get("email")));
            userVo.setMobile(CommUtil.retrunObject(item.get("mobile")));
            userVo.setRealName(CommUtil.retrunObject(item.get("realName")));
            userVo.setUserName(CommUtil.retrunObject(item.get("userName")));
            userVo.setUuid(CommUtil.retrunObject(item.get("uuid")));
            userList.add(userVo);
        }
        PageInfo pageInfo = new PageInfo<>(userMapList);
        resultMap.put("pageInfo", pageInfo);
        resultMap.put("userList", userList);
        return resultMap;
    }

    @Override
    @Transactional
    public void add(UserVo userVo) {
        SysUser sysUser = new SysUser();
        String uuid = CommUtil.generateUUID();
        String salt = CommUtil.generateRandom(5);
        sysUser.setTime(CommUtil.getNowTime());
        sysUser.setUuid(uuid);
        sysUser.setUserName(userVo.getUserName());
        sysUser.setUserPassword(CommUtil.generatePassword(userVo.getUserPassword(), salt));
        sysUser.setEmail(userVo.getEmail());
        sysUser.setMobile(userVo.getMobile());
        sysUser.setState(0);
        sysUser.setRealName(userVo.getRealName());
        sysUser.setSalt(salt);
        sysUser.setCreateId(((SysUser) SecurityUtils.getSubject().getPrincipal()).getUuid());
        sysUserDao.add(sysUser);
        sysUserRoleService.add(uuid,userVo.getRoleList());
    }

    @Override
    @Transactional
    public void update(UserVo userVo) {
        SysUser sysUser = new SysUser();
        sysUser.setUuid(userVo.getUuid());
        if (userVo.getState() == null) {
            String salt = CommUtil.generateRandom(5);
            sysUser.setTime(CommUtil.getNowTime());
            sysUser.setUserName(userVo.getUserName());
            sysUser.setUserPassword(CommUtil.generatePassword(userVo.getUserPassword(), salt));
            sysUser.setEmail(userVo.getEmail());
            sysUser.setMobile(userVo.getMobile());
            sysUser.setRealName(userVo.getRealName());
            sysUser.setSalt(salt);
            sysUserRoleService.add(userVo.getUuid(),userVo.getRoleList());
        } else {
            sysUser.setState(userVo.getState());
        }
        sysUserDao.update(sysUser);
    }

    @Override
    @Transactional
    public void del(String uuid) {
        SysUser sysUser = new SysUser();
        sysUser.setUuid(uuid);
        sysUserDao.del(sysUser);
        SysUserRole sysUserRole=new SysUserRole();
        sysUserRole.setUserId(uuid);
        sysUserRoleService.del(sysUserRole);
    }

}
