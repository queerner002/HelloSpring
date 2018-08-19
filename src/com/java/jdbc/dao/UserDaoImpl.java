package com.java.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Created by Administrator on 2018/8/18 0018.
 */
public class UserDaoImpl implements IUserDao{

    private DriverManagerDataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    public UserDaoImpl() {
        initDatabase();
    }

    private void initDatabase() {
        //设置数据库信息
        dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///test?useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        // 创建JdbcTemplate对象，设置数据源
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public int add(User user) {
        System.out.println("start add method...");
        String sql = "insert into user(username, password) values(?, ?)";
        int rows = jdbcTemplate.update(sql, user.getUsername(), user.getPassword());
        System.out.println("method result: " + rows);
        return rows;
    }
}
