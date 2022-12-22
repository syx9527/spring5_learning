package com.shaoyx.spring5.testdemo;

import com.shaoyx.spring5.Book;
import com.shaoyx.spring5.Orders;
import com.shaoyx.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author SYX
 */
public class TestSpring5Test {

    @Test
    public void testAdd() {
        // 1.加载Spring配置文件
        // import org.springframework.beans.factory.BeanFactory;
        // BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2.获取配置文件创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();


    }

    @Test
    public void testBook1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        // 2.获取配置文件创建的对象
        Book book = context.getBean("book1", Book.class);

        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrders() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        // 2.获取配置文件创建的对象
        Orders orders = context.getBean("orders", Orders.class);

        System.out.println(orders);
        orders.ordersTest();
    }
}
