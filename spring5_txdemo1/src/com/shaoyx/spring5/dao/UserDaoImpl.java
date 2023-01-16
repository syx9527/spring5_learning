package com.shaoyx.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author SYX
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    /**
     * 多钱
     *
     * @param money    发生金额
     * @param userName 转入账的人名
     */
    @Override
    public void addMoney(int money, String userName) {
        String sql = "update `t_account` set `money`=`money` + ? where `username` = ?;";

        jdbcTemplate.update(sql, money, userName);

    }

    /**
     * 少钱
     *
     * @param money    发生金额
     * @param userName 转出账的人名
     */
    @Override
    public void reduceMoney(int money, String userName) {
        String sql = "update `t_account` set `money`=`money` - ? where `username` = ?;";

        jdbcTemplate.update(sql, money, userName);

    }
}
