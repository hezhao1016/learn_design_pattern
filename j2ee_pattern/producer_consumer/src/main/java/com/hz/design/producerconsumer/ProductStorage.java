package com.hz.design.producerconsumer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 库存商品管理类
 *
 * Created by hezhao on 2018-08-08 17:44
 */
public class ProductStorage {

    /**
     * 最大库存量
     */
    public static final int maximum = 100;

    /**
     * 当前库存量
     */
    public static int currentimum = 50;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    // 用于计数
    private AtomicInteger count = new AtomicInteger(0);

    /**
     * 库存管理实例
     */
    private static ProductStorage instance;

    private ProductStorage(){}

    /**
     * 获取单例
     * @return
     */
    public static ProductStorage getInstance(){
        if(instance == null){
            instance = new ProductStorage();
        }
        return instance;
    }

    /**
     * 生产产品
     */
    public synchronized void product(){
        while(currentimum >= maximum /2){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        currentimum++;

        int num = count.getAndIncrement();
        System.out.println("当前线程："+Thread.currentThread().getName() + "--生产者生产了一个商品["+ num +"], 当前库存量：" + currentimum + ", 现在的时间是：" + sdf.format(new Date()));
        notifyAll();
    }

    /**
     * 消费产品
     */
    public synchronized void consume(){
        while(currentimum <= 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        currentimum--;
        System.out.println("当前线程："+Thread.currentThread().getName() + "--消费者消费了一个商品, 当前库存量：" + currentimum + ", 现在的时间是：" + sdf.format(new Date()));
        notifyAll();
    }

}
