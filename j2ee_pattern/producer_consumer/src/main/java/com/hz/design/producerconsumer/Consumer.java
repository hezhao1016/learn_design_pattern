package com.hz.design.producerconsumer;

import java.text.MessageFormat;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * 消费者
 *
 * @Author hezhao
 * @Time 2018-08-09 23:54
 */
public class Consumer implements Runnable{
    private BlockingQueue<PCData> queue;
    private static final int SLEEPTIME = 1000;
    public Consumer(BlockingQueue<PCData> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("start Consumer id :"+Thread.currentThread().getId());
        Random r = new Random();
        try{
            while(true){
                PCData data = queue.take();
                if(data != null)
                {
                    int re = data.getData() * data.getData();
                    System.out.println("消费者ID:" + Thread.currentThread().getId() + " 消费了:"+data.getData() + " result:" + (data.getData() * data.getData()));
                    Thread.sleep(r.nextInt(SLEEPTIME));
                }
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

}