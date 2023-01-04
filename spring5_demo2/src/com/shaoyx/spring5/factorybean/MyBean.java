package com.shaoyx.spring5.factorybean;

import com.shaoyx.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author SYX
 */
public class MyBean implements FactoryBean<Course> {

    /**
     * 定义返回bean
     *
     * @return course
     */
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCourseName("abs");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
