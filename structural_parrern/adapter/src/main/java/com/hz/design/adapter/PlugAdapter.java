package com.hz.design.adapter;

import com.hz.design.adapter.pojo.Plug;
import com.hz.design.adapter.pojo.Receptacle;

/**
 * 插头转换器（适配器）
 *
 * @Author hezhao
 * @Time 2018-08-09 1:52
 */
public class PlugAdapter implements Receptacle {

    private Plug plug;

    public PlugAdapter(Plug plug) {
        this.plug = plug;
    }

    @Override
    public void func() {
        System.out.println("3脚插座适配" + this.plug.intro());
    }

}
