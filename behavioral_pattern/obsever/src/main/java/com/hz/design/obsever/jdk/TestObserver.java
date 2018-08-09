package com.hz.design.obsever.jdk;

/**
 * 测试 观察者模式
 *
 * 在 JDK 中已经提供了 java.util.Observable 和 java.util.Observer 来实观察者模式。
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestObserver {

    public static void main(String[] args) {

        Teacher teacher = new Teacher();

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        teacher.addObserver(s1);
        teacher.addObserver(s2);
        teacher.addObserver(s3);

        teacher.setAction("老师来了");

        System.out.println("================");

        teacher.setAction("老师走了");

    }

}
