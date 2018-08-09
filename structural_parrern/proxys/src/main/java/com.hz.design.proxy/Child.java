package com.hz.design.proxy;

/**
 * 小孩
 * 抽象主题（Subject）：真实主题与代理主题的共同接口。
 *
 * Created by hezhao on 2018-08-09 16:13
 */
public interface Child {

    /**
     * 交学费
     */
    void payTuition();

    /**
     * 上学
     */
    void goSchool();

}
