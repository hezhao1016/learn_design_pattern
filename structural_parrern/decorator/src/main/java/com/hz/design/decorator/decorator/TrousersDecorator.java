package com.hz.design.decorator.decorator;

import com.hz.design.decorator.pojo.Person;

/**
 * 穿裤子
 *
 * Created by hezhao on 2018-08-09 14:09
 */
public class TrousersDecorator extends Decorator {

    public TrousersDecorator(Person person) {
        super(person);
    }

    @Override
    public void decorator() {
        super.decorator();
        System.out.println("穿裤子");
    }
    
}
