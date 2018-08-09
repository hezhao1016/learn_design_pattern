package com.hz.design.mediator;

import java.util.Date;

/**
 * 中介类
 *
 * @Author hezhao
 * @Time 2018-08-10 1:32
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }

}
