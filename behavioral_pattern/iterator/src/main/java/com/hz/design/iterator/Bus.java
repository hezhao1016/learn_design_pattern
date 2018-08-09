package com.hz.design.iterator;

/**
 * 巴士接口（Aggregate）
 *
 * 容器接口（Aggregate）：定义基本功能以及提供类似 Iterator iterator() 的方法。
 *
 * Created by hezhao on 2018-08-09 18:23
 */
public interface Bus {

    /**
     * 上客
     * @param obj
     */
    void getOn(Object obj);

    /**
     * 下客
     * @param obj
     */
    void getOff(Object obj);

    /**
     * 售票员
     * @return
     */
    Conductor conductor();

}
