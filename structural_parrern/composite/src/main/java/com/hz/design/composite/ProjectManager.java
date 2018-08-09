package com.hz.design.composite;

import java.util.ArrayList;

/**
 * 项目组/部门负责人（Composite）
 *
 * Created by hezhao on 2018-08-09 15:13
 */
public class ProjectManager extends Employee{

    private String name;

    public ProjectManager(String name) {
        this.name = name;
        this.employeeList = new ArrayList<>();
    }

    @Override
    public void add(Employee emp) {
        this.employeeList.add(emp);
    }

    @Override
    public void delete(Employee emp) {
        this.employeeList.remove(emp);
    }

    @Override
    public void report() {
        System.out.println(this.name + "汇报项目组员工的任务进度");
        this.employeeList.stream().forEach(Employee::report);
    }
}
