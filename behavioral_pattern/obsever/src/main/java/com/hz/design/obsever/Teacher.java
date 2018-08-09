package com.hz.design.obsever;

/**
 * 学校是禁止在寝室打扑克牌的，但是还是有不少学生违背这条规定
 * 老师是被观察者
 *
 * Created by hezhao on 2018-08-09 18:58
 */
public class Teacher extends Subject {

    private String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
        // 被观察者状态发生变化，通知观察者
        this.notifyAllObserver();
    }

}
