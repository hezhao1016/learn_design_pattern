package com.hz.design.factory.method;

import com.hz.design.factory.pojo.Benz;
import com.hz.design.factory.pojo.Car;

/**
 * 工厂方法模式实现类
 *
 * Created by hezhao on 2018-08-08 15:20
 */
public class BenzFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Benz();
    }

}
