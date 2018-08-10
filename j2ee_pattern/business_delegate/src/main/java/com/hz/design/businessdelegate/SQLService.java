package com.hz.design.businessdelegate;

/**
 * SQL业务
 *
 * Created by hezhao on 2018-08-10 14:50
 */
public class SQLService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking SQL Service");
    }

}
