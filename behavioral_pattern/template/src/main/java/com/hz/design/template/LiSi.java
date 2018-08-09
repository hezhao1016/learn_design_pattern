package com.hz.design.template;

/**
 * 李四
 *
 * Created by hezhao on 2018-08-09 16:43
 */
public class LiSi extends People {

    public LiSi(String name) {
        super(name);
    }

    @Override
    protected void service() {
        System.out.println(this.getName() + "办理取钱业务");
    }
    
}
