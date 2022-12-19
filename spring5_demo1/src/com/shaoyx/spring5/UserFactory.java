package com.shaoyx.spring5;

/**
 * @author SYX
 */
public class UserFactory {
    public static UserDao getUserDao() {
        return new UserDao();
    }
}
