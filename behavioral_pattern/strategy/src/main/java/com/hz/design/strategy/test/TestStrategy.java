package com.hz.design.strategy.test;

import com.hz.design.strategy.*;

/**
 * 测试 策略模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestStrategy {

    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSub());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMul());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationDiv());
        System.out.println("10 / 5 = " + context.executeStrategy(10, 5));

    }

}
