package com.hz.design.proxy.staticproxy;

import com.hz.design.proxy.Child;

/**
 * 静态代理：父母
 * 代理主题（Proxy）：实现抽象主题，是真实主题的代理。通过真实主题的业务逻辑方法来实现抽象方法，并可以附加自己的操作。
 *
 * Created by hezhao on 2018-08-09 16:15
 */
public class Parent implements Child {

    // 持有真实主题接口
    private Child child;

    public Parent(Child child) {
        this.child = child;
    }

    @Override
    public void payTuition() {
        System.out.println("父母交学费");
    }

    @Override
    public void goSchool() {
        // 父母代理孩子交学费，由小孩自己上学。
        this.child.goSchool();
    }

}
