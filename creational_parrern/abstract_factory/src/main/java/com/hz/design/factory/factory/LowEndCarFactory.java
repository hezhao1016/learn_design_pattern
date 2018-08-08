package com.hz.design.factory.factory;

import com.hz.design.factory.pojo.engine.Engine;
import com.hz.design.factory.pojo.engine.LowEndEngine;
import com.hz.design.factory.pojo.seat.LowEndSeat;
import com.hz.design.factory.pojo.seat.Seat;
import com.hz.design.factory.pojo.tyre.LowEndTyre;
import com.hz.design.factory.pojo.tyre.Tyre;

/**
 * 低端汽车工厂实现类
 *
 * Created by hezhao on 2018-08-08 15:40
 */
public class LowEndCarFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new LowEndEngine();
    }

    @Override
    public Tyre createTyre() {
        return new LowEndTyre();
    }

    @Override
    public Seat createsSeat() {
        return new LowEndSeat();
    }

}
