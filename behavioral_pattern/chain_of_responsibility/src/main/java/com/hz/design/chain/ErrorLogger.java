package com.hz.design.chain;

/**
 * 错误日志打印
 *
 * @Author hezhao
 * @Time 2018-08-10 0:53
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }

}
