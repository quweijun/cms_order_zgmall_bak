package com.zgmall.dao.impl;

import com.zgmall.dao.ButtonAliasDao;
import com.zgmall.mapper.consoledb.ButtonAliasMapper;
import com.zgmall.model.ButtonAlias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by zhb on 2017/12/4.
 */
@Service("buttonAliasDao")
public class ButtonAliasDaoImpl implements ButtonAliasDao {
    @Autowired
    ButtonAliasMapper buttonAliasMapper;
    @Override
    public void add(ButtonAlias buttonAlias) {
        buttonAliasMapper.insert(buttonAlias);
    }

    @Override
    public void del(ButtonAlias buttonAlias) {
        buttonAliasMapper.delete(buttonAlias);
    }

    @Override
    public List<ButtonAlias> selectAll() {
        Example example = new Example(ButtonAlias.class);
        example.setOrderByClause("time desc");
        return buttonAliasMapper.selectByExample(example);
    }
}
