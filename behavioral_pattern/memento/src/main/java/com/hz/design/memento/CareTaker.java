package com.hz.design.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author hezhao
 * @Time 2018-08-10 1:44
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        this.mementoList.add(memento);
    }

    public Memento get(int index) {
        return this.mementoList.get(index);
    }

}
