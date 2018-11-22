package com.zgmall.dao;

import com.zgmall.model.ButtonAlias;
import com.zgmall.model.ButtonAlias;

import java.util.List;

/**
 * Created by zhb on 2017/12/4.
 */
public interface ButtonAliasDao {
    void add(ButtonAlias buttonAlias);

    void del(ButtonAlias buttonAlias);

    List<ButtonAlias> selectAll();
}
