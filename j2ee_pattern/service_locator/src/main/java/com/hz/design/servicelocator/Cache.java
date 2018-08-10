package com.hz.design.servicelocator;

import java.util.ArrayList;
import java.util.List;

/**
 * 缓存
 *
 * 缓存存储服务的引用，以便复用它们。
 *
 * Created by hezhao on 2018-08-10 17:11
 */
public class Cache {

    private List<Service> services;

    public Cache(){
        services = new ArrayList<>();
    }

    /**
     * 获取服务
     * @param serviceName
     * @return
     */
    public Service getService(String serviceName){
        for (Service service : services) {
            if(service.getName().equalsIgnoreCase(serviceName)){
                System.out.println("Returning cached  "+serviceName+" object");
                return service;
            }
        }
        return null;
    }

    /**
     * 添加服务
     * @param newService
     */
    public void addService(Service newService){
        boolean exists = false;
        for (Service service : services) {
            if(service.getName().equalsIgnoreCase(newService.getName())){
                exists = true;
            }
        }
        if(!exists){
            services.add(newService);
        }
    }

}
