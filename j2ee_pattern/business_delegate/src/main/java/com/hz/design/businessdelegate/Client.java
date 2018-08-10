package com.hz.design.businessdelegate;

/**
 * 客户端
 *
 * Created by hezhao on 2018-08-10 14:54
 */
public class Client {

    private BusinessDelegate businessDelegate;

    public Client(BusinessDelegate bussinessDelegate) {
        this.businessDelegate = bussinessDelegate;
    }

    public void doTask() {
        this.businessDelegate.doTask();
    }

}
