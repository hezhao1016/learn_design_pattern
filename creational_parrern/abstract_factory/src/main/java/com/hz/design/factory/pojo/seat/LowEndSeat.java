package com.hz.design.factory.pojo.seat;

/**
 * 低端座椅
 *
 * Created by hezhao on 2018-08-08 15:34
 */
public class LowEndSeat implements Seat {

    @Override
    public void feel() {
        System.out.println("低端座椅，坐着难受");
    }

}
