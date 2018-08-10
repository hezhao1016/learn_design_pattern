package com.hz.design.dataaccessobject.dao;

import com.hz.design.dataaccessobject.entity.Student;

import java.util.List;

/**
 * 学生数据访问接口
 *
 * Created by hezhao on 2018-08-10 15:47
 */
public interface StudentDao {

    public List<Student> getAllStudents();

    public Student getStudent(Long userId);

    public void updateStudent(Student student);

    public void deleteStudent(Student student);

}
