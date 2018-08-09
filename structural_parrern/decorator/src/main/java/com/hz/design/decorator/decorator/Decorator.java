package com.hz.design.decorator.decorator;

import com.hz.design.decorator.pojo.Person;

/**
 * 装饰接口
 *
 * Created by hezhao on 2018-08-09 14:05
 */
public class Decorator implements Person {

    // 持有一个Person接口
    private Person person;

    public Decorator(Person person) {
        this.person = person;
    }

    @Override
    public void decorator() {
        if (person != null) this.person.decorator();
    }

}
