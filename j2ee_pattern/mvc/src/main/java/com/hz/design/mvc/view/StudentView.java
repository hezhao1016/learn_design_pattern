package com.hz.design.mvc.view;

import com.hz.design.mvc.model.Student;

/**
 * 学生视图
 *
 * Created by hezhao on 2018-08-10 14:38
 */
public class StudentView {

    public void printStudentDetails(Student stu) {
        System.out.println("Student: ");
        System.out.println("Name: " + stu.getName());
        System.out.println("Age: " + stu.getAge());
    }

}
