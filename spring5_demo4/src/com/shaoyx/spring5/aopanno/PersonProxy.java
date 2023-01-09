package com.shaoyx.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author SYX
 */
@Component
@Aspect
@Order(100)
public class PersonProxy {


    /**
     * 前置通知
     * Before 注解表示作为前置通知
     */
    @Before(value = "execution(* com.shaoyx.spring5.aopanno.User.add(..))")
    public void before() {
        System.out.println("person before ...");
    }
}
