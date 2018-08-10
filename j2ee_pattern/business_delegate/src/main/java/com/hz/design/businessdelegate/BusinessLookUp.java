package com.hz.design.businessdelegate;

/**
 * 服务查找类
 *
 * Created by hezhao on 2018-08-10 14:51
 */
public class BusinessLookUp {

    public BusinessService lookup(String serviceType) {
        if (serviceType == null)   return null;
        serviceType = serviceType.trim().toUpperCase();
        switch (serviceType) {
            case "SQL":
                return new SQLService();
            case "JMS":
                return new JMSService();
        }
        return null;
    }

}
