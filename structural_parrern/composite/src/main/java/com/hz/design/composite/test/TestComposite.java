package com.hz.design.composite.test;

import com.hz.design.composite.Employee;
import com.hz.design.composite.Programmer;
import com.hz.design.composite.ProjectManager;

/**
 * 测试 组合模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestComposite {

    public static void main(String[] args) {

        Employee emp1 = new Programmer("张工");
        Employee emp2 = new Programmer("胡工");

        Employee projectManager = new ProjectManager("老阎");
        projectManager.add(emp1);
        projectManager.add(emp2);

        projectManager.report();

    }

}
