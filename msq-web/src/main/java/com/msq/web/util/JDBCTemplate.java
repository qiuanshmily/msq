package com.msq.web.util;
import com.msq.common.pojo.SeDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JDBCTemplate {

    public static JdbcTemplate dataSourceManager(SeDataSource seDataSource) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(seDataSource.getDriverClassName());
        dataSource.setUrl(seDataSource.getUrl());
        dataSource.setUsername(seDataSource.getUserName());
        dataSource.setPassword(seDataSource.getUserPwd());
        // 创建JDBC模板
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        // 这里也可以使用构造方法
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;

    }


    public static void main(String[] args) {
        SeDataSource dateSourceConfigView = new SeDataSource();
        dateSourceConfigView.setUrl("jdbc:mysql://172.16.101.62:3306/engine");
        dateSourceConfigView.setUserName("root");
        dateSourceConfigView.setUserPwd("DigiMobile!1");
        dateSourceConfigView.setDriverClassName("com.mysql.jdbc.Driver");
        JdbcTemplate jdbcTemplate = dataSourceManager(dateSourceConfigView);
        String sql = "select count(*)  from se_data_source";
        Long num = (long) jdbcTemplate.queryForObject(sql, Long.class);
        System.out.println(num);
    }
}
