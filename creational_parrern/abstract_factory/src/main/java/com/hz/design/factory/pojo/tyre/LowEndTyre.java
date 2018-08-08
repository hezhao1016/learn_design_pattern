package com.hz.design.factory.pojo.tyre;

/**
 * 低端轮胎
 *
 * Created by hezhao on 2018-08-08 15:31
 */
public class LowEndTyre implements Tyre{

    @Override
    public void use() {
        System.out.println("低端轮胎，耐磨大、易打滑");
    }

}
