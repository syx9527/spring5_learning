package com.shaoyx.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author SYX
 */

@Configuration // 作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.shaoyx.spring5"})
public class SpringConfig {

}
