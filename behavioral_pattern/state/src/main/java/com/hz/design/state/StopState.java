package com.hz.design.state;


/**
 * @Author hezhao
 * @Time 2018-08-10 1:50
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }

}
