package com.hz.design.builder.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * 汽车
 *
 * Created by hezhao on 2018-08-08 18:21
 */
@Getter @Setter
public class Car {

    private Engine engine;
    private Tyre tyre;
    private Seat seat;

    public void intro() {
        System.out.println("我在开汽车...");
        this.engine.intro();
        this.tyre.intro();
        this.seat.intro();
    }

}
