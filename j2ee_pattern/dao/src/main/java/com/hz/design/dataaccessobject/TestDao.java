package com.hz.design.dataaccessobject;

import com.hz.design.dataaccessobject.dao.StudentDao;
import com.hz.design.dataaccessobject.dao.impl.StudentDaoImpl;
import com.hz.design.dataaccessobject.entity.Student;

import java.util.List;

/**
 * 测试 数据访问对象模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestDao {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        List<Student> studentList = studentDao.getAllStudents();
        show(studentList);

        // 获取学生
        Student student = studentDao.getStudent(1002L);
        System.out.println(student);

        // 更新学生
        studentDao.updateStudent(Student.builder().stuId(1001L).name("妹大爷").age(78).build());

        show(studentList);

        // 删除学生
        studentDao.deleteStudent(Student.builder().stuId(1001L).build());

        show(studentList);

    }

    public static void show(List<Student> studentList) {
        // 输出所有的学生
        System.out.println("\n============================");
        for (Student stu : studentList) {
            System.out.println(stu);
        }
        System.out.println("\n");
    }

}
