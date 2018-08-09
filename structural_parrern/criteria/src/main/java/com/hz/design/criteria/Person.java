package com.hz.design.criteria;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 人
 *
 * Created by hezhao on 2018-08-09 09:27
 */
@Getter @AllArgsConstructor
public class Person {

    // 姓名
    private String name;
    // 性别
    private String gender;
    // 婚姻状态
    private String maritalStatus;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                '}';
    }
}
