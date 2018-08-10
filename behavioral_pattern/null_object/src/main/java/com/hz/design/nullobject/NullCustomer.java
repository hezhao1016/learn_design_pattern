package com.hz.design.nullobject;

/**
 * 空对象
 *
 * Created by hezhao on 2018-08-10 11:07
 */
public class NullCustomer extends AbstractCustomer{

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

}
