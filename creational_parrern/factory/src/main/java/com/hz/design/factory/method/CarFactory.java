package com.hz.design.factory.method;

import com.hz.design.factory.pojo.Car;

/**
 * 工厂方法模式
 *
 * 工厂方法模式同样属于类的创建型模式又被称为多态工厂模式。工厂方法模式的意义是定义一个创建产品对象的工厂接口，将实际创建工作推迟到子类当中。
 *
 * Created by hezhao on 2018-08-08 15:08
 */
public interface CarFactory {

    /**
     * 创建汽车对象
     *
     * @return
     */
    Car createCar();
}
