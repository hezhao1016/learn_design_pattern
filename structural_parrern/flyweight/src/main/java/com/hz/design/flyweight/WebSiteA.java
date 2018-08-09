package com.hz.design.flyweight;

/**
 * 具体享元：抽象享元角色的具体实现类，并实现了抽象享元角色规定的方法并存储内部状态。
 *
 * Created by hezhao on 2018-08-09 15:54
 */
public class WebSiteA extends WebSite {

    public WebSiteA(String name) {
        this.name = name;
    }

    @Override
    public void show(Company user) {
        System.out.println(user.getName() + "的" + this.name);
    }

}
