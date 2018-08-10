package com.hz.design.interceptingfilter;

/**
 * 客户端
 *
 * Client 是向 Target 对象发送请求的对象。
 *
 * Created by hezhao on 2018-08-10 16:57
 */
public class Client {

    private FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }

}
