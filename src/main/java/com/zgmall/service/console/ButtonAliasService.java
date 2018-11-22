package com.zgmall.service.console;

import com.zgmall.model.ButtonAlias;

import java.util.Map;

/**
 * Created by zhb on 2017/12/4.
 */
public interface ButtonAliasService {
    void add(ButtonAlias buttonAlias);

    void del(ButtonAlias buttonAlias);

    Map<String, Object> selectAll();
}
