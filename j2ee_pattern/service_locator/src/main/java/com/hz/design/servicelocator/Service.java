package com.hz.design.servicelocator;

/**
 * 服务接口
 *
 * 实际处理请求的服务。对这种服务的引用可以在 JNDI 服务器中查找到。
 *
 * Created by hezhao on 2018-08-10 17:09
 */
public interface Service {

    String getName();

    void execute();

}
