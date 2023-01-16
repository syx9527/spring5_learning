package com.shaoyx.spring5.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


/**
 * @author SYX
 */
@Configuration
@ComponentScan(basePackages = "com.shaoyx.spring5")  // 开启组件扫描
@EnableTransactionManagement //开启事务
public class TxConfig {

    /**
     * 创建数据库连接池
     *
     * @return DruidDataSource
     */
    @Bean
    public DruidDataSource getDruidDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/user_db?useSSL=false&serverTimezone=UTC&characterEncoding=UTF-8&useUnicode=yes");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        return dataSource;
    }

    /**
     * 创建JdbcTemplate对象
     *
     * @return DruidDataSource
     */
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        // 到ioc容器中根据类型找到dataSource
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        // 注入dataSource
        jdbcTemplate.setDataSource(dataSource);

        return jdbcTemplate;
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);

        return transactionManager;
    }

}
