package com.hz.design.obsever.jdk;

import java.util.Observable;

/**
 * 学校是禁止在寝室打扑克牌的，但是还是有不少学生违背这条规定
 * 老师是被观察者
 *
 * @Author hezhao
 * @Time 2018-08-10 0:11
 */
public class Teacher extends Observable {

    private String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
        // 被观察者状态发生变化，通知观察者
        this.setChanged();

        // 推模型
        this.notifyObservers(this.action);

        // 拉模型
        // this.notifyObservers();
    }

}
