package com.hz.design.factory.test;

import com.hz.design.factory.factory.CarFactory;
import com.hz.design.factory.factory.HighEndCarFactory;
import com.hz.design.factory.factory.LowEndCarFactory;
import com.hz.design.factory.pojo.engine.Engine;
import com.hz.design.factory.pojo.seat.Seat;
import com.hz.design.factory.pojo.tyre.Tyre;

/**
 * 测试 抽象工厂模式
 *
 * Created by hezhao on 2018-08-08 15:07
 */
public class TestCarFactory {

    public static void main(String[] args) {
        // 高端
        CarFactory cf1 = new HighEndCarFactory();

        Engine highEngine = cf1.createEngine();
        Tyre highTyre = cf1.createTyre();
        Seat highSeat = cf1.createsSeat();

        highEngine.run();
        highTyre.use();
        highSeat.feel();

        System.out.println("=======================================");

        // 低端
        CarFactory cf2 = new LowEndCarFactory();

        Engine lowEngine = cf2.createEngine();
        Tyre lowTyre = cf2.createTyre();
        Seat lowSeat = cf2.createsSeat();

        lowEngine.run();
        lowTyre.use();
        lowSeat.feel();
    }

}
