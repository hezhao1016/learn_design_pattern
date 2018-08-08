package com.hz.design.factory.test;

import com.hz.design.factory.simple.CarFactory;
import com.hz.design.factory.pojo.Car;

/**
 * 测试 简单工厂模式
 *
 * Created by hezhao on 2018-08-08 15:07
 */
public class TestSimpleFactory {

    public static void main(String[] args) {

        // 奔驰
        Car car1 = CarFactory.createCar("benz");
        car1.run();

        // 宝马
        Car car2 = CarFactory.createCar("bmw");
        car2.run();

    }

}
