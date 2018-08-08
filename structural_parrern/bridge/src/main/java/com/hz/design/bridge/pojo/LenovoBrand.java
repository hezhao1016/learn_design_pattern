package com.hz.design.bridge.pojo;

/**
 * 联想品牌
 *
 * @Author hezhao
 * @Time 2018-08-09 2:01
 */
public class LenovoBrand implements Brand{

    @Override
    public void info() {
        System.out.println("联想");
    }

}
