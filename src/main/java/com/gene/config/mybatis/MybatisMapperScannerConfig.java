package com.gene.config.mybatis;


import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

/**
 * Created by Administrator on 2016/12/30.
 * MyBatis扫描接口，使用的tk.mybatis.spring.mapper.MapperScannerConfigurer，如果你不使用通用Mapper，可以改为org.xxx...
 */
@Configuration
@AutoConfigureAfter({DatabaseConfiguration.class,SlaveDatabaseConfiguration.class})
public class MybatisMapperScannerConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer() ;
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("masterSqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.zgmall.mapper.consoledb");
        mapperScannerConfigurer.setMarkerInterface(MyMapper.class);
        Properties properties = new Properties();
        properties.setProperty("IDENTITY" , "MYSQL");
        properties.setProperty("notEmpty", "false");
        return mapperScannerConfigurer;
    }
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer2(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer() ;
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("slaveSqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.genne.mapper.business");
        mapperScannerConfigurer.setMarkerInterface(MyMapper.class);
        Properties properties = new Properties();
        properties.setProperty("IDENTITY" , "MYSQL");
        properties.setProperty("notEmpty", "false");
        return mapperScannerConfigurer;
    }
}

