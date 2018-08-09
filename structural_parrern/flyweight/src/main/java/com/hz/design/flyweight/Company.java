package com.hz.design.flyweight;

/**
 * 外部状态：随环境改变而改变的、不可以共享的状态称为外部状态。
 *
 * Created by hezhao on 2018-08-09 15:50
 */
public class Company {

    private String name;

    public Company(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
