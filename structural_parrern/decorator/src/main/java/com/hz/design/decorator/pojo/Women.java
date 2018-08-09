package com.hz.design.decorator.pojo;

/**
 * 女人
 *
 * Created by hezhao on 2018-08-09 14:02
 */
public class Women implements Person {

    private String name;

    public Women(String name) {
        this.name = name;
    }

    @Override
    public void decorator() {
        System.out.println(name + " 是 女人打扮");
    }

    public String getName() {
        return name;
    }

}
