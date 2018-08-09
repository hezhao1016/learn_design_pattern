package com.hz.design.iterator.test;

import com.hz.design.iterator.Bus;
import com.hz.design.iterator.Conductor;
import com.hz.design.iterator.SkyBus;

/**
 * 测试 迭代器模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestIterator {

    public static void main(String[] args) {

        Bus bus = new SkyBus();
        bus.getOn("张三");
        bus.getOn("李四");
        bus.getOn("王五");

        Conductor iter = bus.conductor();
        while (iter.hasNext()) {
            String name = (String) iter.next();
            System.out.println(name + "乘客，请买票！");
        }

    }

}
