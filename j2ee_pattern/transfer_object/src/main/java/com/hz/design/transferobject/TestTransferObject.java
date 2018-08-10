package com.hz.design.transferobject;

/**
 * 测试
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestTransferObject {

    public static void main(String[] args) {

        StudentBO studentBusinessObject = new StudentBO();

        // 输出所有的学生
        for (StudentVO student : studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    +student.getRollNo()+", Name : "+student.getName()+" ]");
        }

        // 更新学生
        StudentVO student =studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        // 获取学生
        studentBusinessObject.getStudent(0);
        System.out.println("Student: [RollNo : "
                +student.getRollNo()+", Name : "+student.getName()+" ]");

    }

}
