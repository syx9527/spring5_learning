package com.shaoyx.spring5.testdemo;

import com.shaoyx.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author SYX
 */
public class TestSpring5 {

    @Test
    public void testAdd() {
        // 1.加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2.获取配置文件创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();


    }

    @Test
    public void testDelete() {
        System.out.println("!!!");
    }
}
