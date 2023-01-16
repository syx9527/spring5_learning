package com.shaoyx.spring5.service;

import com.shaoyx.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author SYX
 */
@Service

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
public class UserService {
    /**
     * 注入dao
     */
    @Autowired
    private UserDao userDao;

    // public void accountMoney(int money, String outUsername, String toUsername) {

    public void accountMoney() {
        int money = 100;
        String outUsername = "周明轩";
        String toUsername = "蔡瑞霖";
        userDao.reduceMoney(money, outUsername);

        // 模拟异常
        int i = 1 / 0;

        userDao.addMoney(money, toUsername);


    }

}
