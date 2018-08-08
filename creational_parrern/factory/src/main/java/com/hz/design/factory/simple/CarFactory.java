package com.hz.design.factory.simple;

import com.hz.design.factory.pojo.Car;
import com.hz.design.factory.pojo.Benz;
import com.hz.design.factory.pojo.Bmw;
import org.apache.commons.lang3.StringUtils;

/**
 * 简单工厂模式
 *
 * Created by hezhao on 2018-08-08 15:08
 */
public class CarFactory {

    /**
     * 创建汽车对象
     *
     * @param carType 汽车类型
     * @return
     */
    public static Car createCar(String carType) {
        if(StringUtils.isBlank(carType)){
            return null;
        }
        carType = carType.trim().toLowerCase();
        Car car = null;
        switch (carType) {
            case "benz":
                car = new Benz();
                break;
            case "bmw":
                car = new Bmw();
                break;
        }
        return car;
    }

}
