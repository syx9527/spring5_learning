package com.shaoyx.spring5.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author SYX
 */
public class UserLogTest {


    public static final Logger log = LoggerFactory.getLogger(UserLogTest.class);

    public static void main(String[] args) {
        log.info("hello log4j2");
        log.warn("warning log4j2");
    }
}
