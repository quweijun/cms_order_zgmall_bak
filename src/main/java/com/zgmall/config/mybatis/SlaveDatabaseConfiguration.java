package com.zgmall.config.mybatis;

import com.alibaba.druid.pool.xa.DruidXADataSource;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Properties;

//import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Administrator on 2016/12/30.
 * 配置连接池，配置Mybatis持久层
 */
//@Configuration
//@ConfigurationProperties(prefix = "spring.datasource",locations = "classpath:db.properties")
@Component

//@PropertySource("classpath:/db.properties") //接收db.properties文件中的属性
//@Configuration
@ConfigurationProperties(prefix = "spring.datasource2") //接收application.yml中的spring.datasource文件中的属性
//@MapperScan(basePackages = "com.zgmall.mapper_slave", sqlSessionTemplateRef = "slaveSqlSessionTemplate")
public class SlaveDatabaseConfiguration {
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    //初始化大小，最小，最大
    private int initialSize;
   private int minIdle;
    private int maxActive;
    //配置获取连接等待超时的时间
    private int maxWait;
    private int RemoveAbandonedTimeout;//超过时间限制，回收没有用(废弃)的连接
    private boolean RemoveAbandoned; //超过removeAbandonedTimeout时间后，是否进 行没用连接（废弃）的回收
    //配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
    private int timeBetweenEvictionRunsMillis;
    //配置一个连接在池中最小生存的时间，单位是毫秒
    private int minEvictableIdleTimeMillis;
    private String validationQuery;
    private boolean testWhileIdle;
    private boolean testOnBorrow;
    private boolean testOnReturn;

    public SlaveDatabaseConfiguration() {
    }


    @Bean(name = "slaveDataSource")
    public DataSource dataSource() {
        DataSource dataSource = getTomcatPoolingDataSource();
        return dataSource;
    }
    @Bean(name = "slaveSqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory());
    }
//    public JdbcTemplate jdbcTemplate() {
//        return new JdbcTemplate(dataSource());
//    }


    @Bean(name="slaveTransactionManager")
    public DataSourceTransactionManager transactionManager(){
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean(name="slaveSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception{
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        //映射实体包
        sessionFactory.setTypeAliasesPackage("com.zgmall.model");
        //映射mapper文件
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sessionFactory.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
        sessionFactory.setConfiguration(mybatisSetting());
        //配置插件
        //分页插件
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("dialect","mysql");
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("returnPageInfo", "check");
        properties.setProperty("params", "count=countSql");
        properties.setProperty("autoRuntimeDialect","true");
        pageHelper.setProperties(properties);

        Interceptor[] plugins = {pageHelper};
        sessionFactory.setPlugins(plugins);

        return sessionFactory.getObject();
    }
    //从配置文件中获取属性
    private DataSource getTomcatPoolingDataSource() {
        DruidXADataSource dataSource = new DruidXADataSource();
        dataSource.setDriverClassName(driverClassName.trim());
        dataSource.setUrl(url.trim());
        dataSource.setUsername(username.trim());
        dataSource.setPassword(password.trim());

        dataSource.setInitialSize(this.initialSize);
        dataSource.setMaxActive(this.maxActive);
        dataSource.setMinIdle(this.minIdle);
        dataSource.setMaxWait(this.maxWait);
        dataSource.setRemoveAbandonedTimeout(this.RemoveAbandonedTimeout);
        dataSource.setRemoveAbandoned(this.RemoveAbandoned);
        dataSource.setTestOnBorrow(this.testOnBorrow);
        dataSource.setTestOnReturn(this.testOnReturn);
        dataSource.setTestWhileIdle(this.testWhileIdle);
        dataSource.setValidationQuery(this.validationQuery);
        dataSource.setTimeBetweenEvictionRunsMillis(this.timeBetweenEvictionRunsMillis);

        return dataSource;
    }


    @Bean
    public org.apache.ibatis.session.Configuration mybatisSetting(){
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
        return  configuration;
    }

    /**************************从配置文件中读取数据信息**********************************/
    public void setUrl(String url) {
        this.url = url;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
    public int getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(int initialSize) {
        this.initialSize = initialSize;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public int getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(int maxWait) {
        this.maxWait = maxWait;
    }

    public int getRemoveAbandonedTimeout() {
        return RemoveAbandonedTimeout;
    }

    public void setRemoveAbandonedTimeout(int removeAbandonedTimeout) {
        RemoveAbandonedTimeout = removeAbandonedTimeout;
    }

    public boolean isRemoveAbandoned() {
        return RemoveAbandoned;
    }

    public void setRemoveAbandoned(boolean removeAbandoned) {
        RemoveAbandoned = removeAbandoned;
    }

    public int getTimeBetweenEvictionRunsMillis() {
        return timeBetweenEvictionRunsMillis;
    }

    public void setTimeBetweenEvictionRunsMillis(int timeBetweenEvictionRunsMillis) {
        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    }

    public int getMinEvictableIdleTimeMillis() {
        return minEvictableIdleTimeMillis;
    }

    public void setMinEvictableIdleTimeMillis(int minEvictableIdleTimeMillis) {
        this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
    }

    public String getValidationQuery() {
        return validationQuery;
    }

    public void setValidationQuery(String validationQuery) {
        this.validationQuery = validationQuery;
    }

    public boolean isTestWhileIdle() {
        return testWhileIdle;
    }

    public void setTestWhileIdle(boolean testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }

    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public boolean isTestOnReturn() {
        return testOnReturn;
    }

    public void setTestOnReturn(boolean testOnReturn) {
        this.testOnReturn = testOnReturn;
    }
}
