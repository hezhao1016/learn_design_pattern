package com.hz.design.factory.pojo.engine;

/**
 * 低端发动机
 *
 * Created by hezhao on 2018-08-08 15:27
 */
public class LowEndEngine implements Engine {

    @Override
    public void run() {
        System.out.println("低端发动机，启动慢");
    }

}
