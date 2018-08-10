package com.hz.design.mvc.controller;

import com.hz.design.mvc.model.Student;
import com.hz.design.mvc.view.StudentView;

/**
 * 学生控制器
 *
 * Created by hezhao on 2018-08-10 14:39
 */
public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentAge(Integer age){
        model.setAge(age);
    }

    public Integer getStudentAge(){
        return model.getAge();
    }

    public void updateView(){
        view.printStudentDetails(model);
    }

}
