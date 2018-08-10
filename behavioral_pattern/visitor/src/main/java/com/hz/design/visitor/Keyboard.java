package com.hz.design.visitor;

/**
 * 键盘
 *
 * Created by hezhao on 2018-08-10 14:05
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
