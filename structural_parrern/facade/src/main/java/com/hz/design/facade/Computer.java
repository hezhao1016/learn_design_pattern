package com.hz.design.facade;

/**
 * 电脑，定义对外接口
 *
 * 电脑整机是 CPU、内存、硬盘的外观。有了外观以后，启动电脑和关闭电脑都简化了。
 * 直接 new 一个电脑。
 * 在 new 电脑的同时把 cpu、内存、硬盘都初始化好并且接好线。
 *
 * 对外暴露方法（启动电脑，关闭电脑）。
 * 启动电脑（按一下电源键）：启动CPU、启动内存、启动硬盘
 * 关闭电脑（按一下电源键）：关闭硬盘、关闭内存、关闭CPU
 *
 * Created by hezhao on 2018-08-09 15:29
 */
public class Computer {

    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void start() {
        this.cpu.start();
        this.memory.start();
        this.disk.start();
    }

    public void stop() {
        this.disk.stop();
        this.memory.stop();
        this.cpu.stop();
    }

}
