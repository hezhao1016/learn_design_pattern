package com.hz.design.template.test;

import com.hz.design.template.LiSi;
import com.hz.design.template.People;
import com.hz.design.template.ZhangSan;

/**
 * 测试 模板模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestTemplate {

    public static void main(String[] args) {

        People p1 = new ZhangSan("张三");
        p1.work();

        System.out.println("===========");

        People p2 = new LiSi("李四");
        p2.work();

    }

}
