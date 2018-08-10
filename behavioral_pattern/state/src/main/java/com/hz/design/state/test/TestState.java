package com.hz.design.state.test;

import com.hz.design.state.Context;
import com.hz.design.state.StartState;
import com.hz.design.state.State;
import com.hz.design.state.StopState;

/**
 * 测试 状态模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestState {

    public static void main(String[] args) {

        Context context = new Context();

        State startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        State stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());

    }

}
