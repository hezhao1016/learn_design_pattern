package com.hz.design.proxy;

/**
 * 真实主题（RealSubject）：实现抽象主题，定义真实主题所要实现的业务逻辑，供代理主题调用。
 *
 * Created by hezhao on 2018-08-09 16:14
 */
public class RealChild implements Child{

    @Override
    public void payTuition() {
        System.out.println("小孩交学费");
    }

    @Override
    public void goSchool() {
        System.out.println("小孩上学");
    }

}
