package com.hz.design.interceptingfilter;

/**
 * 过滤管理器
 *
 * 过滤管理器管理过滤器和过滤器链。
 *
 * Created by hezhao on 2018-08-10 16:56
 */
public class FilterManager {

    private FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }

}
