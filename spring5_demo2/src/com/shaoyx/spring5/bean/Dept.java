package com.shaoyx.spring5.bean;

/**
 * 部门
 *
 * @author SYX
 */
public class Dept {
    private String deptName;

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return String.format("'%s'", deptName);
    }
}
