package com.hz.design.bridge;

/**
 * 台式电脑
 *
 * @Author hezhao
 * @Time 2018-08-09 1:59
 */
public class DesktopComputer extends Computer{

    public DesktopComputer(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式电脑");
    }

}
