package com.hz.design.adapter;

import com.hz.design.adapter.pojo.Plug;
import com.hz.design.adapter.pojo.Receptacle;

/**
 * 测试
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestAdapter {

    public static void main(String[] args) {
        Plug plug = new Plug();
        Receptacle rp = new PlugAdapter(plug);

        rp.func();
    }

}
