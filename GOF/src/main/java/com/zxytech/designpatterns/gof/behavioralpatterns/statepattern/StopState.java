package com.zxytech.designpatterns.gof.behavioralpatterns.statepattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state.");
        context.setState(this);
    }

    public String toString() {
        return "Stop State.";
    }
}
