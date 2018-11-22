package com.zgmall.controller.console.user;

import com.github.pagehelper.PageHelper;
import com.zgmall.model.SysUser;
import com.zgmall.service.console.SysUserService;
import com.zgmall.common.util.PageUtils;
import com.zgmall.common.util.ShiroUtils;
import com.zgmall.common.util.exception.ExceptionContent;
import com.zgmall.common.util.exception.RestException;
import com.zgmall.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    SysUserService sysUserService;
    /**
     * 添加用户
     * @return
     * @throws RestException
     */
    @RequestMapping("/add")
    public Map<String, Object> add(@RequestBody UserVo userVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            sysUserService.add(userVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch(Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    /**
     * 删除用户
     * @return
     * @throws RestException
     */
    @RequestMapping("/del/{uuid}")
    public Map<String, Object> del(@PathVariable String uuid) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            sysUserService.del(uuid);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    /**
     * 修改用户
     * @return
     * @throws RestException
     */
    @RequestMapping("/update")
    public Map<String, Object> update(@RequestBody UserVo userVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            sysUserService.update(userVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }

    /**
     * 查询所有用户
     * @return
     * @throws RestException
     */
    @RequestMapping("/selectUserAll")
    public Map<String, Object> selectUserAll(@RequestBody UserVo userVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        PageHelper.startPage(userVo.getP(), PageUtils.PAGE_TEN);
        try{
            resultMap.putAll(sysUserService.selectUserAll(userVo));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    /**
     * 查询用户是否登录
     * @return
     * @throws RestException
     */
    @RequestMapping("/selectUser")
    public Map<String, Object> selectUser() throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        SysUser sysUser= (SysUser) ShiroUtils.getSubject().getPrincipal();
        try{
            resultMap.put("sysUser",sysUser);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            throw new RestException(ExceptionContent.SYS_ERROR_MESSAGE, ExceptionContent.SYS_ERROR_CODE);
        }
        return resultMap;
    }

    /**
     * 退出功能
     * @return
     * @throws RestException
     */
    @RequestMapping("/logOut")
    public Map<String, Object> logOut() throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            ShiroUtils.getSubject().logout();
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            throw new RestException(ExceptionContent.SYS_ERROR_MESSAGE, ExceptionContent.SYS_ERROR_CODE);
        }
        return resultMap;
    }
}
