package com.hz.design.iterator;

/**
 * 售票员接口（Iterator）
 *
 * 迭代器接口（Iterator）：该接口必须定义实现迭代功能的最小定义方法集。比如提供 hasNext() 和 next() 方法。
 *
 * Created by hezhao on 2018-08-09 18:21
 */
public interface Conductor {

    /**
     * 将游标指向第一个元素
     */
    void first();

    /**
     * 将游标指向下一个元素,并返回当前游标指向的对象
     * @return
     */
    Object next();

    /**
     * 判断是否存在下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 判断是否是第一个元素
     * @return
     */
    boolean isFirst();

    /**
     * 判断是否是最后一个元素
     * @return
     */
    boolean isLast();

}
