package com.zxytech.designpatterns.gof.behavioralpatterns.statepattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        startState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
