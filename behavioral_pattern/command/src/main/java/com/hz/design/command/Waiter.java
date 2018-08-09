package com.hz.design.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员
 *
 * Created by hezhao on 2018-08-09 17:18
 */
public class Waiter {

    private String name;

    private List<Command> orderList = new ArrayList<>();

    public Waiter(String name) {
        this.name = name;
    }

    /**
     * 点菜
     * @param command
     */
    public void addOrder(Command command) {
        System.out.println("服务员" + this.name + "正在下单:" + command);
        this.orderList.add(command);
    }

    /**
     * 取消菜品
     * @param command
     */
    public void cancelOrder(Command command) {
        System.out.println("服务员" + this.name + "正在取消菜品:" + command);
        this.orderList.remove(command);
    }

    /**
     * 通知厨师做菜
     */
    public void notifyChef() {
        System.out.println("服务员" + this.name + "通知厨师做菜");
        System.out.println("==================================");
        this.orderList.forEach(Command::action);
    }

}
