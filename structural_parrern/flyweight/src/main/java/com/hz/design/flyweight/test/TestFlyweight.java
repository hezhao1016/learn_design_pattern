package com.hz.design.flyweight.test;

import com.hz.design.flyweight.Company;
import com.hz.design.flyweight.WebSite;
import com.hz.design.flyweight.WebSiteFactory;

/**
 * 测试 享元模式
 *
 * 享元（Flyweight）模式是构造型模式之一， 它通过与其他类似对象共享数据来减小内存占用。
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestFlyweight {

    public static void main(String[] args) {

        WebSite ws1 = WebSiteFactory.getWebSite("后台管理系统");
        WebSite ws2 = WebSiteFactory.getWebSite("后台管理系统");

        System.out.println(ws1 == ws2);

        ws1.show(new Company("A公司"));
        ws1.show(new Company("B公司"));

    }

}
