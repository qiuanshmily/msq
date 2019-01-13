package com.msq.web.util;
import com.digiwin.sqlengine.domain.view.DateSourceConfigView;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JDBCTemplate {

    public static JdbcTemplate dataSourceManager(DateSourceConfigView dateSourceConfigView) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(dateSourceConfigView.getDriverClassName());
        dataSource.setUrl(dateSourceConfigView.getUrl());
        dataSource.setUsername(dateSourceConfigView.getUserName());
        dataSource.setPassword(dateSourceConfigView.getUserPwd());
        // 创建JDBC模板
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        // 这里也可以使用构造方法
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;

    }


    public static void main(String[] args) {
        DateSourceConfigView dateSourceConfigView = new DateSourceConfigView();
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
