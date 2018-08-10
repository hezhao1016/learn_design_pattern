package com.hz.design.visitor;

/**
 * 电脑
 *
 * Created by hezhao on 2018-08-10 11:46
 */
public class Computer implements ComputerPart{

    private ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }

}
