package com.hz.design.command;

/**
 * 做北京烤鸭命令
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
