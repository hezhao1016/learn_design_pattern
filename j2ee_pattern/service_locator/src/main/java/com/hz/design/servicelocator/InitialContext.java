package com.hz.design.servicelocator;

/**
 * 初始的 Context - JNDI Context 带有对要查找的服务的引用。
 *
 * Created by hezhao on 2018-08-10 17:11
 */
public class InitialContext {

    public Object lookup(String jndiName){
        if(jndiName.equalsIgnoreCase("SERVICE1")){
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        }else if (jndiName.equalsIgnoreCase("SERVICE2")){
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }

}
