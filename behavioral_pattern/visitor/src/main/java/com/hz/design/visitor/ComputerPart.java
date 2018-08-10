package com.hz.design.visitor;

/**
 * 电脑配件接口
 *
 * Created by hezhao on 2018-08-10 11:44
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);

}
