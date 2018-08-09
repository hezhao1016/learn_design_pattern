package com.hz.design.decorator.decorator;

import com.hz.design.decorator.pojo.Person;

/**
 * 穿衣服
 *
 * Created by hezhao on 2018-08-09 14:09
 */
public class ClothesDecorator extends Decorator {

    public ClothesDecorator(Person person) {
        super(person);
    }

    @Override
    public void decorator() {
        super.decorator();
        System.out.println("穿衣服");
    }

}
