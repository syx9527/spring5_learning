package com.shaoyx.spring5.collectiontype;

/**
 * 课程
 *
 * @author SYX
 */
public class Course {
    private String courseName;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
}
