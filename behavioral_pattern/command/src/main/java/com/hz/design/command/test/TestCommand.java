package com.hz.design.command.test;

import com.hz.design.command.*;

/**
 * 测试 命令模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestCommand {

    public static void main(String[] args) {

        // 厨师
        Chef chef1 = new Chef("张三");
        Chef chef2 = new Chef("李四");

        // 客人点单
        Command command1 = new CookChickenCommand(chef1);
        Command command2 = new CookChickenCommand(chef2);
        Command command3 = new CookDuckCommand(chef2);

        // 服务员记录客人点单
        Waiter waiter = new Waiter("小王");
        waiter.addOrder(command1);
        waiter.addOrder(command2);
        waiter.addOrder(command3);

        // 鸭有骚味，不要了
        waiter.cancelOrder(command3);

        // 一次性通知
        waiter.notifyChef();
    }

}
