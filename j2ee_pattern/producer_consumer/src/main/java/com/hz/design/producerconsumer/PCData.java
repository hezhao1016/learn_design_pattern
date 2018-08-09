package com.hz.design.producerconsumer;

/**
 * 容器数据类型
 *
 * @Author hezhao
 * @Time 2018-08-09 23:55
 */
public class PCData {

    private final int intData;

    public PCData(int d){
        intData = d;
    }

    public PCData(String d){
        intData = Integer.valueOf(d);
    }

    public int getData(){
        return intData;
    }

    @Override
    public String toString(){
        return "data:"+intData;
    }

}
