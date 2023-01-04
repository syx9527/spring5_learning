package com.shaoyx.spring5.bean;

/**
 * @author SYX
 */
public class Orders {
    private String ordersName;

    public Orders() {
        System.out.println("");
    }

    public void setOrdersName(String ordersName) {
        this.ordersName = ordersName;
    }
}
