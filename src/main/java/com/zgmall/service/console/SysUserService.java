package com.zgmall.service.console;

import com.zgmall.model.SysUser;
import com.zgmall.vo.UserVo;
import com.zgmall.vo.UserVo;

import java.util.Map;

/**
 * Created by zhb on 2017/11/21.
 */
public interface SysUserService {
    SysUser selectAmUserByName(String username);

    Map<String, Object> selectUserAll(UserVo userVo);

    void add(UserVo userVo);

    void update(UserVo userVo);

    void del(String uuid);
}
