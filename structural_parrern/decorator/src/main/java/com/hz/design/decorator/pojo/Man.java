package com.hz.design.decorator.pojo;

/**
 * 男人
 *
 * Created by hezhao on 2018-08-09 14:02
 */
public class Man implements Person {

    private String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public void decorator() {
        System.out.println(name + " 是 男人打扮");
    }

    public String getName() {
        return name;
    }

}
