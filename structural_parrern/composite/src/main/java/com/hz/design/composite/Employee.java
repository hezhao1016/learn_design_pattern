package com.hz.design.composite;

import java.util.List;

/**
 * 员工， 抽象类（Component）：可以看作公司发布的招聘岗位
 *
 * Created by hezhao on 2018-08-09 15:10
 */
public abstract class Employee {

    // 员工列表
    protected List<Employee> employeeList;

    /**
     * 招聘员工
     * @param emp
     */
    public abstract void add(Employee emp);

    /**
     * 开除员工
     * @param emp
     */
    public abstract void delete(Employee emp);

    /**
     * 报告工作进度
     */
    public abstract void report();

}
