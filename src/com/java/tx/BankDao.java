package com.java.tx;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Administrator on 2018/8/19 0019.
 */
public class BankDao {
    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addBalance(long id, double money) {
        String sql = "UPDATE user SET balance = balance + ? WHERE id = ?";
        jdbcTemplate.update(sql, money, id);
    }

    public void deductBalance(long id, double money) {
        String sql = "UPDATE user SET balance = balance - ? WHERE id = ?";
        jdbcTemplate.update(sql, money, id);
    }
}
