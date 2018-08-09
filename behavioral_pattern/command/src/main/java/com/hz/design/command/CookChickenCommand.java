package com.hz.design.command;

/**
 * 做宫保鸡丁命令
 *
 * Created by hezhao on 2018-08-09 17:17
 */
public class CookChickenCommand implements Command {

    private Chef chef;

    public CookChickenCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void action() {
        this.chef.cookChicken();
    }

}
