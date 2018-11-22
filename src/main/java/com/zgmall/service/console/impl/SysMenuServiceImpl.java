package com.zgmall.service.console.impl;

import com.github.pagehelper.PageInfo;
import com.zgmall.dao.SysMenuDao;
import com.zgmall.dao.SysUserDao;
import com.zgmall.model.SysMenu;
import com.zgmall.model.SysUser;
import com.zgmall.service.console.SysMenuService;
import com.zgmall.common.util.CommUtil;
import com.zgmall.common.util.ShiroUtils;
import com.zgmall.vo.MenuVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("sysMenuService")
public class SysMenuServiceImpl implements SysMenuService {
    @Autowired
    SysMenuDao sysMenuDao;
    @Autowired
    SysUserDao sysUserDao;

    /**
     * 查询所有权限菜单  分页
     * @param menuVO
     * @return
     */
    @Override
    public Map<String, Object> selectMenuAll(MenuVo menuVO) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        SysMenu sysMenu=new SysMenu();
        sysMenu.setMenuName(menuVO.getMenuName());
        sysMenu.setParentId(menuVO.getParentId());
        sysMenu.setMenuType(menuVO.getMenuType());
        List<Map<String, Object>> menuListMap = sysMenuDao.selectMenuAndParent(sysMenu);
        PageInfo pageInfo = new PageInfo<>(menuListMap);
        resultMap.put("pageInfo", pageInfo);
        resultMap.put("menuList", this.getMapMenuVo(menuListMap));
        return resultMap;
    }



    /**
     * 系统启动加载所有权限
     * @param sysUser
     * @return
     */
    @Override
    public Set<String> selectAllPerms(SysUser sysUser) {
        List<SysMenu> permsList;
        if (sysUser.getRealName().equalsIgnoreCase("admin")) {
            permsList = sysMenuDao.selectUserPerms("");
        } else {
            permsList = sysMenuDao.selectUserPerms(sysUser.getUuid());
        }
        Set<String> permSet = new HashSet<>();
        for (SysMenu item : permsList) {
            if (StringUtils.isBlank(item.getPerms())) {
                continue;
            }
            permSet.addAll(Arrays.asList(item.getPerms().trim().split(",")));
        }
        return permSet;
    }

    /**
     * 主页面左侧列表 按登录用户查询
     * @return
     */
    @Override
    public Map<String, Object> selectMenuUser() {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        SysUser sysUser= (SysUser) ShiroUtils.getSubject().getPrincipal();
        List<SysMenu> menuList=new ArrayList<>();
        if(sysUser.getUserName().equals("admin")){
             menuList = sysMenuDao.selectAllMenu();
        }else{
             menuList = sysMenuDao.selectUserPerms(sysUser.getUuid());
        }
        //System.out.println(new Gson().toJson(menuList).toString());
        resultMap.put("menuList", menuList);
        return resultMap;
    }

    /**
     * 查询当前角色的菜单
     * @param roleId
     * @return
     */
    @Override
    public Map<String, Object> selectMenuRole(String roleId) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        List<Map<String, Object>> sysMenuMap = sysMenuDao.selectMenuRole(roleId);
        List<MenuVo> menuList = this.getMapMenuVo(sysMenuMap);
        resultMap.put("menuList", menuList);
        return resultMap;
    }

    /**
     * 查询所有菜单 按层级显示
     * @return
     */
    @Override
    public Map<String, Object> selectAllMenuTree() {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        List<Map<String, Object>> menuListMap = sysMenuDao.selectMenuAndParent(new SysMenu());
        List<MenuVo> menuList = this.getMapMenuVo(menuListMap);
        List<MenuVo> menuList1 = new ArrayList<>();
        for (MenuVo sysMenu : menuList) {
            if (sysMenu.getParentId() == null || sysMenu.getParentId().equals("")) {
                menuList1.add(sysMenu);
            }
        }
        for (MenuVo menu : menuList1) {
            menu.setChildren(tree(menu.getId(), menuList));
        }
        resultMap.put("sysMenuList", menuList1);
        return resultMap;
    }

    /**
     * 递归层级循环
     * @param id
     * @param menuList
     * @return
     */
    public List<MenuVo> tree(String id, List<MenuVo> menuList) {
        List<MenuVo> childList = new ArrayList<>();
        for (MenuVo menu : menuList) {
            if (StringUtils.isNotBlank(menu.getParentId())) {
                if (menu.getParentId().equals(id)) {
                    childList.add(menu);
                }
            }
        }
        for (MenuVo menu : childList) {
            menu.setChildren(tree(menu.getId(), menuList));
        }
        return childList;
    }

    /**
     * 根据状态获取 父目录
     * @param sysMenu
     * @return
     */
    @Override
    public Map<String, Object> selectParentMenu(SysMenu sysMenu) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        List<SysMenu> sysMenuList=sysMenuDao.selectParentMenu(sysMenu);
        resultMap.put("sysMenuList",sysMenuList);
        return resultMap;
    }

    @Override
    public void add(SysMenu sysMenu) {
        sysMenu.setUuid(CommUtil.generateUUID());
        sysMenu.setTime(CommUtil.getNowTime());
        sysMenu.setState(0);
        sysMenuDao.add(sysMenu);
    }

    @Override
    public void update(SysMenu sysMenu) {
        if(sysMenu.getState()==null){
            sysMenu.setTime(CommUtil.getNowTime());
        }
        sysMenuDao.update(sysMenu);
    }

    @Override
    public void del(String uuid) {
        SysMenu sysMenu =new SysMenu();
        sysMenu.setUuid(uuid);
        sysMenuDao.del(sysMenu);
    }


    /**
     * 封装
     * @param menuListMap
     * @return
     */
    public   List<MenuVo>  getMapMenuVo(List<Map<String, Object>> menuListMap){
        List<MenuVo> menuVoList = new ArrayList<>();
        for (Map<String, Object> item : menuListMap) {
            MenuVo menuVo = new MenuVo();
            menuVo.setParentName(CommUtil.retrunObject(item.get("parentName")));
            menuVo.setAlias(CommUtil.retrunObject(item.get("alias")));
            menuVo.setUuid(CommUtil.retrunObject(item.get("uuid")));
            menuVo.setMenuName(CommUtil.retrunObject(item.get("menu_name")));
            menuVo.setMenuComp(CommUtil.retrunObject(item.get("menu_comp")));
            menuVo.setMenuUrl(CommUtil.retrunObject(item.get("menu_url")));
            menuVo.setMenuIcon(CommUtil.retrunObject(item.get("menu_icon")));
            menuVo.setMenuOrder(CommUtil.retrunInteger(item.get("menu_order")));
            menuVo.setState(Integer.parseInt(item.get("state").toString()));
            menuVo.setMenuType(Integer.parseInt(item.get("menu_type").toString()));
            menuVo.setTime(Integer.parseInt(item.get("time").toString()));
            menuVo.setPerms(CommUtil.retrunObject(item.get("perms")));
            menuVo.setParentId(CommUtil.retrunObject(item.get("parent_id")));
            menuVo.setId(CommUtil.retrunObject(item.get("uuid")));
            menuVo.setLabel(CommUtil.retrunObject(item.get("menu_name")));
            menuVoList.add(menuVo);
        }
        return menuVoList;
    }
}
