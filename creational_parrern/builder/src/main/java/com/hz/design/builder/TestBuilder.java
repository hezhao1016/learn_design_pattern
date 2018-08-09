package com.hz.design.builder;

import com.hz.design.builder.builder.MyCarBuilder;
import com.hz.design.builder.director.CarDirector;
import com.hz.design.builder.director.MyCarDirector;
import com.hz.design.builder.pojo.Car;

/**
 * 测试 建造者模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestBuilder {

    public static void main(String[] args) {

        CarDirector carDirector = new MyCarDirector(new MyCarBuilder());

        Car car = carDirector.directCar();
        car.intro();
    }

}
