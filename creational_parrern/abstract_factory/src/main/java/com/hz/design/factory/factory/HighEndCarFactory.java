package com.hz.design.factory.factory;

import com.hz.design.factory.pojo.engine.Engine;
import com.hz.design.factory.pojo.engine.HighEndEngine;
import com.hz.design.factory.pojo.seat.HighEndSeat;
import com.hz.design.factory.pojo.seat.Seat;
import com.hz.design.factory.pojo.tyre.HighEndTyre;
import com.hz.design.factory.pojo.tyre.Tyre;

/**
 * 高端汽车工厂实现类
 *
 * Created by hezhao on 2018-08-08 15:40
 */
public class HighEndCarFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new HighEndEngine();
    }

    @Override
    public Tyre createTyre() {
        return new HighEndTyre();
    }

    @Override
    public Seat createsSeat() {
        return new HighEndSeat();
    }

}
