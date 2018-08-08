package com.hz.design.builder.builder;

import com.hz.design.builder.pojo.Engine;
import com.hz.design.builder.pojo.Seat;
import com.hz.design.builder.pojo.Tyre;

/**
 * 汽车建造者
 *
 * Created by hezhao on 2018-08-08 18:28
 */
public interface CarBuilder {

    Engine builderEngine();

    Tyre builderTyre();

    Seat builderSeat();

}
