package com.hz.design.interceptingfilter;

/**
 * 用户鉴权过滤器
 *
 * Created by hezhao on 2018-08-10 16:55
 */
public class DebugFilter implements Filter {

    public void execute(String request){
        System.out.println("request log: " + request);
    }

    // 在之后执行
    @Override
    public boolean isBefore() {
        return false;
    }
}