package com.hz.design.builder.builder;

import com.hz.design.builder.pojo.Engine;
import com.hz.design.builder.pojo.Seat;
import com.hz.design.builder.pojo.Tyre;

/**
 * 汽车建造接口具体实现
 *
 * Created by hezhao on 2018-08-08 18:29
 */
public class MyCarBuilder implements CarBuilder {

    @Override
    public Engine builderEngine() {
        return new Engine();
    }

    @Override
    public Tyre builderTyre() {
        return new Tyre();
    }

    @Override
    public Seat builderSeat() {
        return new Seat();
    }

}
