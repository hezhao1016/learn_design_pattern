package com.hz.design.bridge;

/**
 * 电脑接口
 *
 * @Author hezhao
 * @Time 2018-08-09 1:58
 */
public abstract class Computer {

    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info() {
        this.brand.info();
    }

}
