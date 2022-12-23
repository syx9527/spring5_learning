package com.shaoyx.spring5;

/**
 * 使用有参构造注入
 *
 * @author SYX
 */
public class Orders {
    private String ordersName;
    private String address;

    public Orders(String ordersName, String address) {
        this.ordersName = ordersName;
        this.address = address;
    }

    public void ordersTest() {
        System.out.println(ordersName + "::" + address);
    }
}
