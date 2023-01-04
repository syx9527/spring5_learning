package com.shaoyx.spring5.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * @author SYX
 */
public class Student {


    /**
     * 数组类型属性
     */
    private String[] courses;

    /**
     * List集合类型属性
     */
    private List<String> list;

    /**
     * Map集合类型属性
     */
    private Map<String, String> map;

    /**
     * Set集合类型属性
     */
    private Set<String> sets;

    /**
     * 学生所学多门课程
     */
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public Student() {
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", map=" + map +
                ", sets=" + sets +
                ", courseList=" + courseList +
                '}';
    }
}
