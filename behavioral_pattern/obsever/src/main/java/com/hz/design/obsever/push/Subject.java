package com.hz.design.obsever.push;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者（Subject）：当需要被观察的状态发生变化时，需要通知队列中所有观察者对象。Subject 需要维持（添加，删除，通知）一个观察者对象的队列列表。
 *
 * Created by hezhao on 2018-08-09 18:53
 */
public abstract class Subject {

    private List<Observer> list = new ArrayList<>();

    public void registerObsever(Observer obs) {
        this.list.add(obs);
    }

    public void removeObserver(Observer obs) {
        list.add(obs);
    }

    // 通知所有的观察者更新状态
    public void notifyAllObserver(String action) {
        this.list.forEach(e -> e.update(action));
    }

}
