package com.hz.design.memento;

/**
 * @Author hezhao
 * @Time 2018-08-10 1:42
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
