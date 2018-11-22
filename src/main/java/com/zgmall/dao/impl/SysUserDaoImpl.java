package com.zgmall.dao.impl;

import com.zgmall.dao.SysUserDao;
import com.zgmall.mapper.consoledb.SysUserMapper;
import com.zgmall.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;

@Service("sysUserDao")
public class SysUserDaoImpl implements SysUserDao {
    @Autowired
    SysUserMapper sysUserMapper;
    @Override
    public SysUser selectAmUserByName(String username) {
        return sysUserMapper.selectAmUserByName(username);
    }

    @Override
    public List<Map<String, Object>> selectUserAll(String name) {
        return sysUserMapper.selectUserAll(name);
    }

    @Override
    public void add(SysUser sysUser) {
        sysUserMapper.insert(sysUser);
    }

    @Override
    public void update(SysUser sysUser) {
        Example example = new Example(SysUser.class);
        example.createCriteria().andCondition("uuid= ",sysUser.getUuid());
        sysUserMapper.updateByExampleSelective(sysUser,example);
    }

    @Override
    public void del(SysUser sysUser) {
        sysUserMapper.delete(sysUser);
    }
}
