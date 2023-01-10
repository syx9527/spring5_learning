package com.shaoyx.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author SYX
 */
@Configuration
@ComponentScan(basePackages = {"com.shaoyx.spring5"}) // 扫描包
@EnableAspectJAutoProxy(proxyTargetClass = true) // 开启注解扫描
public class ConfigAop {

}

