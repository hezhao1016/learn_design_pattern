package com.hz.design.servicelocator.test;

import com.hz.design.servicelocator.Service;
import com.hz.design.servicelocator.ServiceLocator;

/**
 * 测试 服务定位器模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestServiceLocator {

    public static void main(String[] args) {

        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();

    }

}
