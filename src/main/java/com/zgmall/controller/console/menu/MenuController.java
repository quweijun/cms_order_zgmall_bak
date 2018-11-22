package com.zgmall.controller.console.menu;

import com.github.pagehelper.PageHelper;
import com.zgmall.model.SysMenu;
import com.zgmall.model.SysUser;
import com.zgmall.service.console.SysMenuService;
import com.zgmall.common.util.CommUtil;
import com.zgmall.common.util.PageUtils;
import com.zgmall.common.util.ShiroUtils;
import com.zgmall.common.util.exception.ExceptionContent;
import com.zgmall.common.util.exception.RestException;
import com.zgmall.vo.MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.log4j.Logger;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;
import java.util.Map;


@RestController
@RequestMapping("/menu")
public class MenuController {
    //log4j
    private static Logger logger = Logger.getLogger(MenuController.class);
    //logback
    //private static Logger logger = LoggerFactory.getLogger(MenuController.class);
    @Autowired
    SysMenuService sysMenuService;
    /**
     * 添加权限
     * @return
     * @throws RestException
     */
    @RequestMapping("/add")
    public Map<String, Object> add(@RequestBody SysMenu sysMenu) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            sysMenuService.add(sysMenu);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    /**
     * 修改权限
     * @return
     * @throws RestException
     */
    @RequestMapping("/update")
    public Map<String, Object> update(@RequestBody SysMenu sysMenu) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            sysMenuService.update(sysMenu);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    /**
     * 删除权限
     * @return
     * @throws RestException
     */
    @GetMapping("/del/{uuid}")
    public Map<String, Object> del(@PathVariable String uuid) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            sysMenuService.del(uuid);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    /**
     * 根据状态获取父目录
     * @return
     * @throws RestException
     */
    @RequestMapping("/selectParentMenu")
    public Map<String, Object> selectParentMenu(@RequestBody SysMenu sysMenu) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            resultMap.putAll(sysMenuService.selectParentMenu(sysMenu));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    /**
     * 查询权限递归
     * @return
     * @throws RestException
     */
    @RequestMapping("/selectAllMenuTree")
    public Map<String, Object> selectAllMenuTree() throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            resultMap.putAll(sysMenuService.selectAllMenuTree());
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    /**
     * 查询所有权限
     * @return
     * @throws RestException
     */
    @RequestMapping("/selectMenuAll")
    public Map<String, Object> selectMenuAll(@RequestBody MenuVo menuVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        PageHelper.startPage(menuVo.getP(), PageUtils.PAGE_TEN);
        try{
            resultMap.putAll(sysMenuService.selectMenuAll(menuVo));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    /**
     * 查询当前用户的权限
     * @return
     * @throws RestException
     */
    @RequestMapping("/selectMenuUser")
    public Map<String, Object> selectMenuUser() throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();

        try{
            resultMap.putAll(sysMenuService.selectMenuUser());
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }

    /**
     * 查询当前角色权限
     * @return
     * @throws RestException
     */
    @RequestMapping("/selectMenuRole/{roleId}")
    public Map<String, Object> selectMenuRole(@PathVariable String roleId) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        SysUser sysUser= (SysUser)ShiroUtils.getSubject().getPrincipal();
        try{
            resultMap.putAll(sysMenuService.selectMenuRole(roleId));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
            //输出ResultMap JSON格式到控制台
            System.out.println("======="+ CommUtil.convertMapToJson(resultMap).toString());
            logger.info("======="+ CommUtil.convertMapToJson(resultMap).toString());
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    /**
     * 查询当前模块的所有权限
     * @return
     * @throws RestException
     */
   /* @RequestMapping("/selectMenuAlias/{id}")
    public Map<String, Object> selectMenuAlias(@PathVariable String id) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            resultMap.putAll(sysMenuService.selectMenuAlias(id));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }*/

}
