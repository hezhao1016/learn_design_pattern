package com.hz.design.visitor.test;

import com.hz.design.visitor.Computer;
import com.hz.design.visitor.ComputerPart;
import com.hz.design.visitor.ComputerPartDisplayVisitor;

/**
 * 测试 访问者模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestVisitor {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

    }

}
