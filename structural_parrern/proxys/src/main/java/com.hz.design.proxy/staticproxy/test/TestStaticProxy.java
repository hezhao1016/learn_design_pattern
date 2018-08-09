package com.hz.design.proxy.staticproxy.test;

import com.hz.design.proxy.Child;
import com.hz.design.proxy.staticproxy.Parent;
import com.hz.design.proxy.RealChild;

/**
 * 测试 静态代理模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestStaticProxy {

    public static void main(String[] args) {

        // 真实主题
        Child child = new RealChild();

        // 手动创建代理对象
        Child proxy = new Parent(child);

        proxy.payTuition();
        proxy.goSchool();

    }

}
