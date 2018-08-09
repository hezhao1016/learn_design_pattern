package com.hz.design.bridge;

/**
 * 笔记本电脑
 *
 * @Author hezhao
 * @Time 2018-08-09 1:59
 */
public class LaptopComputer extends Computer{

    public LaptopComputer(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("笔记本电脑");
    }

}
