package com.hz.design.frontcontroller;

import com.hz.design.frontcontroller.controller.FrontController;

/**
 * 测试 前端控制器模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestFrontController {

    public static void main(String[] args) {

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HomeView");
        frontController.dispatchRequest("StudentView");

    }

}
