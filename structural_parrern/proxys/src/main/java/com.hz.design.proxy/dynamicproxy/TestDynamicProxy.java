package com.hz.design.proxy.dynamicproxy;

import com.hz.design.proxy.Child;
import com.hz.design.proxy.RealChild;
import com.hz.design.proxy.staticproxy.Parent;

import java.lang.reflect.Proxy;

/**
 * 测试 动态代理模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestDynamicProxy {

    public static void main(String[] args) {

        // 真实主题
        Child child = new RealChild();

        ChildHandler childHandler = new ChildHandler(child);

        // 代理对象
        Child proxy = (Child) Proxy.newProxyInstance(
                child.getClass().getClassLoader(),
                child.getClass().getInterfaces(),
                childHandler);

        proxy.payTuition();
        proxy.goSchool();

    }

}
