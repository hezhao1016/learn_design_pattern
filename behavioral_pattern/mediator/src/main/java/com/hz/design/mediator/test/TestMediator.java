package com.hz.design.mediator.test;

import com.hz.design.mediator.User;

/**
 * 测试 中介者模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestMediator {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");


    }

}
