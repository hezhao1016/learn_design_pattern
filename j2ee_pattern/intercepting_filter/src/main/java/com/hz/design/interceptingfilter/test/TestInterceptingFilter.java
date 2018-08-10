package com.hz.design.interceptingfilter.test;

import com.hz.design.interceptingfilter.*;

/**
 * 测试 拦截过滤器模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestInterceptingFilter {

    public static void main(String[] args) {

        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");

    }

}
