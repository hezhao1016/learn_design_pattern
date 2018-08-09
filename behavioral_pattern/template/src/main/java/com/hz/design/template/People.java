package com.hz.design.template;

/**
 * 模板类
 *
 * Created by hezhao on 2018-08-09 16:39
 */
public abstract class People {

    private String name;

    public People(String name) {
        this.name = name;
    }

    private void queueUp() {
        System.out.println(this.name + "排队取号等候");
    }

    /**
     * 子类重写 service 方法实现不同的业务需求。
     */
    protected abstract void service();

    private void evaluate() {
        System.out.println(this.name + "反馈评分");
    }

    /**
     * 模板方法被设置为 final
     * 该方法不管方法实现，只负责调用方法顺序。
     */
    public final void work() {
        this.queueUp();
        this.service();
        this.evaluate();
    }

    public String getName() {
        return name;
    }

}
