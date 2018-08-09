package com.hz.design.interpreter;

/**
 * 表达式接口
 *
 * @Author hezhao
 * @Time 2018-08-10 1:07
 */
public interface Expression {
    boolean interpret(String context);
}
