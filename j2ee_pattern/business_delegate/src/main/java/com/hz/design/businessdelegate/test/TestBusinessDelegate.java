package com.hz.design.businessdelegate.test;

import com.hz.design.businessdelegate.BusinessDelegate;
import com.hz.design.businessdelegate.Client;

/**
 * 测试 业务代表模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestBusinessDelegate {

    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("SQL");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();

    }

}
