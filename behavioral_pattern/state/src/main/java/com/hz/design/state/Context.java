package com.hz.design.state;

/**
 * @Author hezhao
 * @Time 2018-08-10 1:52
 */
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
