package com.shaoyx.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 增强的类
 *
 * @author SYX
 */
@Component
@Aspect  // 生成代理对象
@Order(300)
public class UserProxy {

    /**
     * 抽取相同切入点
     */
    @Pointcut(value = "execution(* com.shaoyx.spring5.aopanno.User.add(..))")
    public void pointDemo() {

    }

    /**
     * 前置通知
     * Before 注解表示作为前置通知
     */
    @Before(value = "pointDemo()")
    public void before() {
        System.out.println("before ...");
    }

    /**
     * 最终通知
     */
    @After(value = "pointDemo()")
    public void after() {
        System.out.println("after ...");
    }

    /**
     * 后置通知（返回通知）
     */
    @AfterReturning(value = "execution(* com.shaoyx.spring5.aopanno.User.add(..))")
    public void afterReturning() {
        System.out.println("afterReturning ...");
    }

    /**
     * 异常通知
     */
    @AfterThrowing(value = "execution(* com.shaoyx.spring5.aopanno.User.add(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing ...");
    }

    /**
     * 环绕通知,z在程序执行前后都进行处理
     */
    @Around(value = "execution(* com.shaoyx.spring5.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before ...");
        // 被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("around after ...");

    }

}
