package com.hz.design.interceptingfilter;

/**
 * 过滤器接口
 *
 * 过滤器在请求处理程序执行请求之前或之后，执行某些任务。
 *
 * Created by hezhao on 2018-08-10 16:54
 */
public interface Filter {

    /**
     * 过滤器具体业务
     *
     * @param request
     */
    void execute(String request);

    /**
     * 是否在业务之前执行，默认是
     *
     * @return
     */
    default boolean isBefore() {
        return true;
    }

}
