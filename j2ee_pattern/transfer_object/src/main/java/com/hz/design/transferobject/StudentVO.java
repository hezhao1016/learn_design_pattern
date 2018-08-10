package com.hz.design.transferobject;

import java.io.Serializable;

/**
 * 传输对象
 *
 * Created by hezhao on 2018-08-10 17:17
 */
public class StudentVO implements Serializable {
    private static final long serialVersionUID = -5570147818623316277L;

    private String name;
    private int rollNo;

    public StudentVO(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

}
