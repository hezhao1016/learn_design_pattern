package com.hz.design.bridge.test;

import com.hz.design.bridge.AsusBrand;
import com.hz.design.bridge.Computer;
import com.hz.design.bridge.DesktopComputer;

/**
 * 测试 桥接模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestBridge {

    public static void main(String[] args) {

        Computer computer = new DesktopComputer(new AsusBrand());
        computer.info();

    }

}
