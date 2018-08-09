package com.hz.design.obsever.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * 学生是观察者。学生观察老师是否来到寝室，从而做出不同的行为。
 *
 * Created by hezhao on 2018-08-09 18:55
 */
public class Student implements Observer {

    private String action;

    /**
     * 更新
     * @param o 被观察者对象
     * @param arg action
     */
    @Override
    public void update(Observable o, Object arg) {
        // 推模型
        String teacherAction = (String) arg;

        // 拉模型
        // String teacherAction = ((Teacher) o).getAction();

        switch (teacherAction) {
            case "老师来了":
                action = "假装学习";
                break;
            case "老师走了":
                action = "继续打牌";
                break;
        }

        System.out.println(action);
    }

    public String getAction() {
        return action;
    }

}
