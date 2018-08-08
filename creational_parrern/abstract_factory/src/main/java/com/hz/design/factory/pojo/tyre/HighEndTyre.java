package com.hz.design.factory.pojo.tyre;

/**
 * 高端轮胎
 *
 * Created by hezhao on 2018-08-08 15:31
 */
public class HighEndTyre implements Tyre{

    @Override
    public void use() {
        System.out.println("高端轮胎，耐磨防滑");
    }

}
