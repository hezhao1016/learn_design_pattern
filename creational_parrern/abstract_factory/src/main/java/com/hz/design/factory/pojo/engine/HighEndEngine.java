package com.hz.design.factory.pojo.engine;

/**
 * 高端发动机
 *
 * Created by hezhao on 2018-08-08 15:27
 */
public class HighEndEngine implements Engine {

    @Override
    public void run() {
        System.out.println("高端发动机，启动快");
    }

}
