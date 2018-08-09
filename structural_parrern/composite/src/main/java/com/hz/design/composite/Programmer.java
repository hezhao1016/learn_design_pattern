package com.hz.design.composite;

import java.util.Random;

/**
 * 程序员（Leaf）：项目组/部门的组成部分
 *
 * Created by hezhao on 2018-08-09 15:15
 */
public class Programmer extends Employee{

    private String name;

    public Programmer(String name) {
        this.name = name;
    }

    @Override
    public void add(Employee emp) {

    }

    @Override
    public void delete(Employee emp) {

    }

    @Override
    public void report() {
        Random rd = new Random();
        String temp = String.format("%.2f", rd.nextFloat() * 100);
        System.out.println(this.name + "任务进度为：" + temp + "%");
    }
}
