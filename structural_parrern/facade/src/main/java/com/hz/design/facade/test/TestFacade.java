package com.hz.design.facade.test;

import com.hz.design.facade.Computer;

/**
 * 测试 外观模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestFacade {

    public static void main(String[] args) {
        Computer sm = new Computer();

        sm.start();

        System.out.println("\n玩电脑...\n");

        sm.stop();

    }

}
