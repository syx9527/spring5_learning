package com.shaoyx.spring5.service;

import com.shaoyx.spring5.dao.UserDao;
import com.shaoyx.spring5.dao.UserDaoImpl;

/**
 * @author SYX
 */
public class UserService {

    // 创建UserDao类属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add ...");

        // 创建UserDao对象,原始方法
        // UserDao userDao = new UserDaoImpl();
        // userDao.update();

        userDao.update();

    }
}
