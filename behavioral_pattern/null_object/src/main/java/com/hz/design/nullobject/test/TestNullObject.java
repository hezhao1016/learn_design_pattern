package com.hz.design.nullobject.test;

import com.hz.design.nullobject.AbstractCustomer;
import com.hz.design.nullobject.CustomerFactory;

/**
 * 测试 空对象模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestNullObject {

    public static void main(String[] args) {

        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("================Customers================");
        System.out.println(customer1.getName() + " : " + customer1.isNil());
        System.out.println(customer2.getName() + " : " + customer2.isNil());
        System.out.println(customer3.getName() + " : " + customer3.isNil());
        System.out.println(customer4.getName() + " : " + customer4.isNil());

    }

}
