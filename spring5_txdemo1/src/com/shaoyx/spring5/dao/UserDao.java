package com.shaoyx.spring5.dao;

/**
 * @author SYX
 */
public interface UserDao {

    /**
     * 多钱
     * @param money 发生金额
     * @param userName  转入账的人名
     */
    public void addMoney(int money,String userName);

    /**
     * 少钱
     * @param money 发生金额
     * @param userName  转出账的人名
     */
    public void reduceMoney(int money,String userName);

}
