package com.shaoyx.spring5.bean;

/**
 * 员工
 *
 * @author SYX
 */
public class Emp {
    private String empName;
    private String empGender;

    /**
     * 员工属于某一个部门，使用对象表示
     */
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empName='" + empName + '\'' +
                ", empGender='" + empGender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
