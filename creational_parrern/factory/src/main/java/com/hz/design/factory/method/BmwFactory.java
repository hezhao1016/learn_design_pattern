package com.hz.design.factory.method;

import com.hz.design.factory.pojo.Bmw;
import com.hz.design.factory.pojo.Car;

/**
 * 工厂方法模式实现类
 *
 * Created by hezhao on 2018-08-08 15:20
 */
public class BmwFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Bmw();
    }

}
