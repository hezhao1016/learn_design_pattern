package com.hz.design.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂：负责创建和管理享元角色。
 *
 * Created by hezhao on 2018-08-09 15:56
 */
public class WebSiteFactory {

    private static Map<String, WebSite> map = new HashMap<>();

    public static WebSite getWebSite(String type) {
        if (!map.containsKey(type)) {
            System.out.println("Creating WebSite of type : " + type);
            map.put(type, new WebSiteA(type));
        }
        return map.get(type);
    }

}
