package com.hz.design.businessdelegate;

/**
 * JMS业务
 *
 * Created by hezhao on 2018-08-10 14:50
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }

}
