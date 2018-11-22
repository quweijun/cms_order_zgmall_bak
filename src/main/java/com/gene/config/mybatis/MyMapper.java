package com.gene.config.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 继承自己的MyMapper
 *
 * @author zhaining
 * @since 2016-09-06 19:53
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
