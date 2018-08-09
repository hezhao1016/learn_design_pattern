package com.hz.design.template;

/**
 * 张三
 *
 * Created by hezhao on 2018-08-09 16:43
 */
public class ZhangSan extends People {

    public ZhangSan(String name) {
        super(name);
    }

    @Override
    protected void service() {
        System.out.println(this.getName() + "办理存钱业务");
    }

}
