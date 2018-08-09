package com.hz.design.command;

/**
 * 厨师类
 * Invoker：执行请求命令的执行者。
 *
 * Created by hezhao on 2018-08-09 17:15
 */
public class Chef {

    private String name;

    public Chef(String name) {
        this.name = name;
    }

    public void cookDuck() {
        System.out.println("厨师" + this.name + "做北京烤鸭");
    }

    public void cookChicken() {
        System.out.println("厨师" + this.name + "做宫保鸡丁");
    }

}
