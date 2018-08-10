package com.hz.design.mvc;

import com.hz.design.mvc.controller.StudentController;
import com.hz.design.mvc.model.Student;
import com.hz.design.mvc.view.StudentView;

/**
 * 测试 MVC 模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestMVC {

    public static void main(String[] args) {

        // 模拟：从数据库获取学生记录
        Student model = findStudent();

        // 创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        // 更新模型数据
        controller.setStudentName("John");

        controller.updateView();

    }

    private static Student findStudent(){
        Student student = new Student();
        student.setName("Robert");
        student.setAge(22);
        return student;
    }

}
