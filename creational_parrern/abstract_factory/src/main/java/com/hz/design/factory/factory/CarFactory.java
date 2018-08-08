package com.hz.design.factory.factory;

import com.hz.design.factory.pojo.engine.Engine;
import com.hz.design.factory.pojo.seat.Seat;
import com.hz.design.factory.pojo.tyre.Tyre;

/**
 * 汽车抽象工厂接口
 *
 * Created by hezhao on 2018-08-08 15:38
 */
public interface CarFactory {

    /**
     * 创建发动机
     *
     * @return
     */
    Engine createEngine();

    /**
     * 创建轮胎
     *
     * @return
     */
    Tyre createTyre();

    /**
     * 创建座椅
     *
     * @return
     */
    Seat createsSeat();

}
