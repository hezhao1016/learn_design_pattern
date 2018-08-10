package com.hz.design.servicelocator;

/**
 * Created by hezhao on 2018-08-10 17:10
 */
public class Service1 implements Service{

    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }

}
