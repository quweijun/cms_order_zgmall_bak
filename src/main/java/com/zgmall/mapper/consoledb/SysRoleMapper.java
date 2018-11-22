package com.zgmall.mapper.consoledb;

import com.zgmall.config.mybatis.MyMapper;
import com.zgmall.model.SysRole;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by zhb on 2017/11/28.
 */
@Service("SysRoleMapper")
public interface SysRoleMapper extends MyMapper<SysRole> {
    List<SysRole> selectUserRole(String uuid);

    List<Map<String,Object>> selectAllRole(String roleName);
}
