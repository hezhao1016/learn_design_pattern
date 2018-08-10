package com.hz.design.dataaccessobject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 学生
 *
 * Created by hezhao on 2018-08-10 14:37
 */
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class Student {

    private Long stuId;
    private String name;
    private Integer age;

}
