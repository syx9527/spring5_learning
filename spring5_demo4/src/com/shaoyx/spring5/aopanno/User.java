package com.shaoyx.spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * 被增强的类
 *
 * @author SYX
 */

@Component
public class User {
    public void add() {
        // int i = 10 / 0;
        System.out.println("add ...");
    }
}
