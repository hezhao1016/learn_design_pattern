package com.hz.design.frontcontroller.dispatcher;

import com.hz.design.frontcontroller.view.View;

/**
 * 调度器
 *
 * Created by hezhao on 2018-08-10 16:35
 */
public class Dispatcher {

    /** 视图类的包名 */
    private static final String VIEW_ROOT = "com.hz.design.frontcontroller.view";

    /**
     * 调用视图
     *
     * @param viewClass 视图类名
     *
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public void dispatch(String viewClass) {
        try {
            // 使用反射创建视图对象
            Class<?> clazz = Class.forName(VIEW_ROOT + "." + viewClass);
            View view = (View) clazz.newInstance();
            view.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
