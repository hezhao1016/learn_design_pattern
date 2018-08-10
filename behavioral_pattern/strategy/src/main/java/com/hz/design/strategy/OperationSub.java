package com.hz.design.strategy;

/**
 * 减法
 *
 * Created by hezhao on 2018-08-10 11:21
 */
public class OperationSub implements Strategy{

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }

}
