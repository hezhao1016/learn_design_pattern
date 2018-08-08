package com.hz.design.prototype;

import java.util.Date;

/**
 * 测试
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestSheep {

    public static void main(String[] args) throws CloneNotSupportedException {

        Date date = new Date(1365215478956L);

        Sheep sheep = new Sheep();
        sheep.setName("多利");
        sheep.setBirthday(date);

        Sheep clone = (Sheep) sheep.clone();
        System.out.println("克隆羊名字：" + clone.getName());
        System.out.println("克隆羊生日：" + clone.getBirthday());

        System.out.println("--------------------------------");
        // 修改本体羊生日
        date.setTime(3246584261356L);
        System.out.println("本体羊生日：" + sheep.getBirthday());
        System.out.println("克隆羊生日：" + clone.getBirthday());

        // clone()默认是浅克隆
        // 修改本体羊的日期，结果克隆羊的日期也发生变化
        // 浅度克隆只对基本数据类型的值进行备份，而引用类型的数据只是拷贝了指向对象的引用而已

    }

}
