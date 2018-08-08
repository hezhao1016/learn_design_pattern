package com.hz.design.producerconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestMain {

    public static void main(String [] args){
        startProductThread();
        startConsumThread();
    }

    /**
     * 开启生产者线程
     */
    public static void startProductThread(){
        System.out.println("--生产者线程执行开始--");
        int pThreadSize = 4;
        ExecutorService pool = Executors.newFixedThreadPool(pThreadSize);
        for(int i=0; i<pThreadSize; i++){
            Producer productThread = new Producer();
            Thread thread = new Thread(productThread);
            pool.execute(thread);
        }
        System.out.println("--生产者线程执行结束--");
    }

    /**
     * 开启消费者线程
     */
    public static void startConsumThread(){
        System.out.println("--消费者线程执行开始--");
        int pThreadSize = 4;
        ExecutorService pool = Executors.newFixedThreadPool(pThreadSize);
        for(int i=0; i<pThreadSize; i++){
            Consumer consumeThread = new Consumer();
            Thread thread = new Thread(consumeThread);
            pool.execute(thread);
        }
        System.out.println("--消费者线程执行结束--");
    }

}
