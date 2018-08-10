package com.hz.design.visitor;

/**
 * 显示器
 *
 * Created by hezhao on 2018-08-10 14:05
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
