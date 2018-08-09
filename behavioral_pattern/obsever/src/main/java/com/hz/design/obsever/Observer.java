package com.hz.design.obsever;

/**
 * 观察者（Observer）：接口或抽象类。当 Subject 的状态发生变化时，Observer 对象将通过一个 callback 函数得到通知。
 *
 * Created by hezhao on 2018-08-09 18:54
 */
public interface Observer {

    void update(Subject subject);

}
