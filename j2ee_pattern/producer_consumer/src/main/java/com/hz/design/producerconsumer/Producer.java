package com.hz.design.producerconsumer;

/**
 * 商品生产者模型
 *
 * Created by hezhao on 2018-08-08 17:45
 */
public class Producer implements Runnable {

    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ProductStorage.getInstance().product();
        }
    }

}