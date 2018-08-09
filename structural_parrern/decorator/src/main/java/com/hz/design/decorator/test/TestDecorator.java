package com.hz.design.decorator.test;

import com.hz.design.decorator.decorator.ClothesDecorator;
import com.hz.design.decorator.decorator.Decorator;
import com.hz.design.decorator.decorator.ShoesDecorator;
import com.hz.design.decorator.decorator.TrousersDecorator;
import com.hz.design.decorator.pojo.Man;
import com.hz.design.decorator.pojo.Person;

/**
 * 测试 装饰模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestDecorator {

    public static void main(String[] args) {

        Person person = new Man("迈克");
        Person decorator = new Decorator(person);

        System.out.println("======第一种打扮=======");
        Decorator cd = new ClothesDecorator(decorator);
        TrousersDecorator td = new TrousersDecorator(cd);
        td.decorator();

        System.out.println("======第一种打扮=======");
        ShoesDecorator sd = new ShoesDecorator(person);
        sd.decorator();


    }

}
