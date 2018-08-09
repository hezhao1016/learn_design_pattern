package com.hz.design.interpreter;

/**
 * @Author hezhao
 * @Time 2018-08-10 1:25
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }

}
