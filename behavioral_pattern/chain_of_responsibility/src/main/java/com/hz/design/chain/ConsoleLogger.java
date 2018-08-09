package com.hz.design.chain;

/**
 * 控制台日志打印
 *
 * @Author hezhao
 * @Time 2018-08-10 0:53
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }

}
