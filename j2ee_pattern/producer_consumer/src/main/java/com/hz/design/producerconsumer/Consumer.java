package com.hz.design.producerconsumer;

/**
 * 商品消费者模型
 *
 * Created by hezhao on 2018-08-08 17:45
 */
public class Consumer implements Runnable{

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ProductStorage.getInstance().consume();
        }

    }

}
