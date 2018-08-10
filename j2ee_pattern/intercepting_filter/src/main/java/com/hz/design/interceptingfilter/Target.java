package com.hz.design.interceptingfilter;

/**
 * 请求处理程序
 *
 * Created by hezhao on 2018-08-10 16:56
 */
public class Target {

    public void execute(String request){
        System.out.println("Executing request: " + request);
    }

}
