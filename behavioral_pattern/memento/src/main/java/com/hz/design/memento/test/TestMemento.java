package com.hz.design.memento.test;

import com.hz.design.memento.CareTaker;
import com.hz.design.memento.Originator;

/**
 * 测试 备忘录模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestMemento {

    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");

        careTaker.add(originator.saveStateToMemnto());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemnto());

        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());

    }

}
