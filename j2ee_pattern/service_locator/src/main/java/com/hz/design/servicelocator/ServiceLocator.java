package com.hz.design.servicelocator;

/**
 * 服务定位器
 *
 * 服务定位器是通过 JNDI 查找和缓存服务来获取服务的单点接触。
 *
 * Created by hezhao on 2018-08-10 17:11
 */
public class ServiceLocator {

    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName){

        Service service = cache.getService(jndiName);

        if(service != null){
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service)context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }

}
