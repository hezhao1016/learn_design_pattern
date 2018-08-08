package com.hz.design.singleton;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 *
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 *
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 *
 * Created by hezhao on 2018-08-08 17:59
 */
public class Singleton4 {

    private static Singleton4 instance;

    /** 让构造函数为private，这样该类就不会被实例化 */
    private Singleton4() {}

    /** 获取唯一可用的对象 */
    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World! - by Singleton4.");
    }

}
