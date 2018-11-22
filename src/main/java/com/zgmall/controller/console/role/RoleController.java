package com.zgmall.controller.console.role;

import com.github.pagehelper.PageHelper;
import com.zgmall.service.console.SysRoleService;
import com.zgmall.common.util.PageUtils;
import com.zgmall.common.util.exception.ExceptionContent;
import com.zgmall.common.util.exception.RestException;
import com.zgmall.vo.RoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    SysRoleService  sysRoleService;

    /**
     * 添加角色
     * @param roleVo
     * @return
     * @throws RestException
     */
    @PostMapping("/insert")
    public Map<String, Object> insert(@RequestBody RoleVo roleVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            sysRoleService.insert(roleVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.INSERT_ERROR_MSG, ExceptionContent.INSERT_ERROR_CODE);
        }
        return resultMap;
    }
    /**
     * 修改角色
     * @param roleVo
     * @return
     * @throws RestException
     */
    @PostMapping("/update")
    public Map<String, Object> update(@RequestBody RoleVo roleVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            sysRoleService.update(roleVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.INSERT_ERROR_MSG, ExceptionContent.INSERT_ERROR_CODE);
        }
        return resultMap;
    }
    @GetMapping("/del/{uuid}")
    public Map<String, Object> del(@PathVariable String uuid) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            sysRoleService.del(uuid);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.INSERT_ERROR_MSG, ExceptionContent.INSERT_ERROR_CODE);
        }
        return resultMap;
    }




    /**
     * 查询当前用户的所有角色
     * @return
     * @throws RestException
     */
    @GetMapping("/selectUserRole/{uuid}")
    public Map<String, Object> selectUserRole(@PathVariable String uuid) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            resultMap.putAll(sysRoleService.selectUserRole(uuid));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    /**
     * 添加用户时查询所有角色
     * @return
     * @throws RestException
     */
    @GetMapping("/selectRole")
    public Map<String, Object> selectRole() throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            resultMap.putAll(sysRoleService.selectRole());
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }

    /**
     * 查询所有角色
     * @param roleVo
     * @return
     * @throws RestException
     */
    @PostMapping("/selectAllRole")
    public Map<String, Object> selectAllRole(@RequestBody RoleVo roleVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            PageHelper.startPage(roleVo.getP(), PageUtils.PAGE_TEN);
            resultMap.putAll(sysRoleService.selectAllRole(roleVo));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
}
