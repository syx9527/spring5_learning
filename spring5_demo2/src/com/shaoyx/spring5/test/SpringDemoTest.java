package com.shaoyx.spring5.test;

import com.shaoyx.spring5.collectiontype.Book;
import com.shaoyx.spring5.collectiontype.Course;
import com.shaoyx.spring5.collectiontype.Student;
import com.shaoyx.spring5.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author SYX
 */
public class SpringDemoTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.test();
        // System.out.println(book);
    }

    @Test
    public void test21() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        // book.test();
        System.out.println(book1);
        System.out.println(book2);
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

}
