package com.hz.design.obsever.pull;

/**
 * 测试 观察者模式 拉模型
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestObserver {

    public static void main(String[] args) {

        Teacher teacher = new Teacher();

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        teacher.registerObsever(s1);
        teacher.registerObsever(s2);
        teacher.registerObsever(s3);

        teacher.setAction("老师来了");

        System.out.println("================");

        teacher.setAction("老师走了");

    }

}
