package com.shaoyx.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @author SYX
 */

@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao add...");
    }
}
