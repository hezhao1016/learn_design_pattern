package com.hz.design.nullobject;

/**
 * 真实对象
 *
 * Created by hezhao on 2018-08-10 11:06
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

}
