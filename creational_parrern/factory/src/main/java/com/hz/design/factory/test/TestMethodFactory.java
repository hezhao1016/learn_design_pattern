package com.hz.design.factory.test;

import com.hz.design.factory.method.BenzFactory;
import com.hz.design.factory.method.BmwFactory;
import com.hz.design.factory.method.CarFactory;
import com.hz.design.factory.pojo.Car;

/**
 * 测试 工厂方法模式
 *
 * Created by hezhao on 2018-08-08 15:07
 */
public class TestMethodFactory {

    public static void main(String[] args) {

        // 奔驰
        CarFactory cf1 = new BenzFactory();
        Car car1 = cf1.createCar();
        car1.run();

        // 宝马
        CarFactory cf2 = new BmwFactory();
        Car car2 = cf2.createCar();
        car2.run();

    }

}
