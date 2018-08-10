package com.hz.design.dataaccessobject.dao.impl;

import com.google.common.collect.Lists;
import com.hz.design.dataaccessobject.dao.StudentDao;
import com.hz.design.dataaccessobject.entity.Student;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Dao实现类
 *
 * Created by hezhao on 2018-08-10 15:48
 */
public class StudentDaoImpl implements StudentDao {

    // 模拟数据库操作
    private List<Student> students;

    public StudentDaoImpl(){
        // 初始化数据
        students = Lists.newArrayList(
                Student.builder().stuId(1001L).name("张三").age(22).build(),
                Student.builder().stuId(1002L).name("李四").age(24).build()
        );
        System.out.println("初始化数据完成。");
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    // https://blog.csdn.net/sinat_27403673/article/details/81565742
    @Override
    public Student getStudent(Long stuId) {
        System.out.println("根据UserId[" + stuId + "]获取学生信息");
        List<Student> list = students.stream().filter(e -> e.getStuId().equals(stuId)).collect(Collectors.toList());
        if (CollectionUtils.isNotEmpty(list)) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public void updateStudent(Student student) {
        Student stu = getStudent(student.getStuId());
        if (stu != null) {
            System.out.println("修改学生信息 ::: " + student);
            stu.setName(student.getName());
            stu.setAge(student.getAge());
        }
    }

    @Override
    public void deleteStudent(Student student) {
        Student stu = getStudent(student.getStuId());
        if (stu != null) {
            stu.setName(student.getName());
            stu.setAge(student.getAge());
        }
        System.out.println("删除学生信息 ::: " + student);
        students.remove(stu);
    }

}
