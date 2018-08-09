package com.hz.design.proxy.dynamicproxy;

import com.hz.design.proxy.Child;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的实现手段：JDK 自带的 Proxy 类、CGlib、Javaassist 等。
 * 处理器类
 *
 * Created by hezhao on 2018-08-09 16:22
 */
public class ChildHandler implements InvocationHandler {

    private Child child;

    public ChildHandler(Child child) {
        this.child = child;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object obj = null;

        if ("goSchool".equals(method.getName())) {
            System.out.println("父母交学费");

            obj = method.invoke(child, args);
        }

        return obj;
    }

}
