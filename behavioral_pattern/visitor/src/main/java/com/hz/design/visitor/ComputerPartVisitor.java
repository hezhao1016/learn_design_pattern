package com.hz.design.visitor;

/**
 * 访问者接口
 *
 * Created by hezhao on 2018-08-10 11:45
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

}
