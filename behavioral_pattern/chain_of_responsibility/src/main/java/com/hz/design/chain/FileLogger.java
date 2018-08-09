package com.hz.design.chain;

/**
 * 文件日志打印
 *
 * @Author hezhao
 * @Time 2018-08-10 0:53
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }

}
