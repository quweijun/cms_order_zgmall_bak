package com.zgmall.mapper.consoledb;


import com.zgmall.config.mybatis.MyMapper;
import com.zgmall.model.SysUser;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service("SysUserMapper")
public interface SysUserMapper extends MyMapper<SysUser> {
    List<String> selectUserPerms(String uuid);

    SysUser selectAmUserByName(String username);

    List<Map<String,Object>> selectUserAll(String name);

}
