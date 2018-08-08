package com.hz.design.prototype;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 羊
 *
 * @Author hezhao
 * @Time 2018-08-09 1:36
 */
@Getter @Setter
public class Sheep implements Cloneable{

    private String name;
    private Date birthday;

    /**
     * 深度克隆
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        Sheep sheep = (Sheep) clone;
        // 克隆引用类型数据
        sheep.birthday = (Date) this.birthday.clone();

        return sheep;
    }

}
