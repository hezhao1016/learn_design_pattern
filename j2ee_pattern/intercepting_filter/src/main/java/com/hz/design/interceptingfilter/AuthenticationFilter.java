package com.hz.design.interceptingfilter;

/**
 * 用户鉴权过滤器
 *
 * Created by hezhao on 2018-08-10 16:55
 */
public class AuthenticationFilter implements Filter {

    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }

}