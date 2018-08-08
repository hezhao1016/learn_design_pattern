package com.hz.design.factory.pojo.seat;

/**
 * 高端座椅
 *
 * Created by hezhao on 2018-08-08 15:34
 */
public class HighEndSeat implements Seat {

    @Override
    public void feel() {
        System.out.println("高端座椅，坐着舒适");
    }

}
