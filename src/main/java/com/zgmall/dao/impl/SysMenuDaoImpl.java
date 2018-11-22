package com.zgmall.dao.impl;

import com.zgmall.dao.SysMenuDao;
import com.zgmall.mapper.consoledb.SysMenuMapper;
import com.zgmall.model.SysMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import java.util.List;
import java.util.Map;

@Service("sysMenuDao")
public class SysMenuDaoImpl implements SysMenuDao {
    @Autowired
    SysMenuMapper sysMenuMapper;
     @Override
    public List<SysMenu> selectAllMenu() {
        Example example = new Example(SysMenu.class);
        example.createCriteria().andCondition("state= ",1);
        example.setOrderByClause("menu_order IS NULL,menu_order,menu_type ASC");
        return sysMenuMapper.selectByExample(example);
    }

    @Override
    public List<SysMenu> selectParentMenu(SysMenu sysMenu) {
        return sysMenuMapper.selectParentMenu(sysMenu);
    }

    @Override
    public void del(SysMenu sysMenu) {
        sysMenuMapper.delete(sysMenu);
    }

    @Override
    public void update(SysMenu sysMenu) {
        Example example = new Example(SysMenu.class);
        example.createCriteria().andCondition("uuid= ",sysMenu.getUuid());
        sysMenuMapper.updateByExampleSelective(sysMenu,example);
    }

    @Override
    public void add(SysMenu sysMenu) {
        sysMenuMapper.insertSelective(sysMenu);
    }

    @Override
    public List<SysMenu> selectUserPerms(String userId) {
        return sysMenuMapper.selectUserPerms(userId);
    }

    @Override
    public List<Map<String,Object>> selectMenuRole(String roleId) {
        return sysMenuMapper.selectMenuRole(roleId);
    }

    @Override
    public List<Map<String,Object>> selectMenuAndParent(SysMenu sysMenu) {

        return sysMenuMapper.selectMenuAndParent(sysMenu);
    }
}
