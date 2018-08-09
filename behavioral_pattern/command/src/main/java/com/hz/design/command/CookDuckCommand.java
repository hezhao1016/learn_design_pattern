package com.hz.design.command;

/**
 * 做北京烤鸭命令
 * ConcreteCommand：将一个接收者对象绑定于一个动作。调用接收者相应的操作，以实现Execute。
 *
 * Created by hezhao on 2018-08-09 17:17
 */
public class CookDuckCommand implements Command {

    private Chef chef;

    public CookDuckCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void action() {
        this.chef.cookDuck();
    }

}
