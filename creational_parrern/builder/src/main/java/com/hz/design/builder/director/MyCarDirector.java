package com.hz.design.builder.director;

import com.hz.design.builder.builder.CarBuilder;
import com.hz.design.builder.pojo.Car;
import com.hz.design.builder.pojo.Engine;
import com.hz.design.builder.pojo.Seat;
import com.hz.design.builder.pojo.Tyre;

/**
 * 汽车装配接口具体实现
 *
 * @Author hezhao
 * @Time 2018-08-09 1:29
 */
public class MyCarDirector implements CarDirector {

    private CarBuilder carBuilder;

    public MyCarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    @Override
    public Car directCar() {
        Engine engine = this.carBuilder.builderEngine();
        Tyre tyre = this.carBuilder.builderTyre();
        Seat seat = this.carBuilder.builderSeat();

        // 装配
        Car car = new Car();
        car.setEngine(engine);
        car.setTyre(tyre);
        car.setSeat(seat);

        return car;
    }

}
