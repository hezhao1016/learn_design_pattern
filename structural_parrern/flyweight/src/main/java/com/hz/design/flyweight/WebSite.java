package com.hz.design.flyweight;

/**
 * 抽象享元：所有具体享元类的父类，规定一些需要实现的公共接口，可接收外部状态。
 *
 * Created by hezhao on 2018-08-09 15:53
 */
public abstract class WebSite {

    // 内部状态：在享元对象内部并不会随环境变化而改变的共享部分
    protected String name;

    public abstract void show(Company user);

}
