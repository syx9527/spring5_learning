package com.shaoyx.spring5.bean;

/**
 * @author SYX
 */
public class Orders {
    private String ordersName;

    public Orders() {
        System.out.println("第一步 执行无参构造创建bean实例");
    }

    public void setOrdersName(String ordersName) {
        this.ordersName = ordersName;
        System.out.println("第二部 调用set方法设置值");
    }

    /**
     * 创建执行的初始化的方法,方法名可自定义
     */
    public void initMethod() {
        System.out.println("第三步 执行初始化方法");
    }

    /**
     * 创建执行的销毁的方法,方法名可自定义
     */
    public void destroyMethod() {
        System.out.println("第五步 执行销毁方法");
    }
}
