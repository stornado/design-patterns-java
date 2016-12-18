package com.zxytech.designpatterns.gof.behavioralpatterns.statepattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in start state.");
        context.setState(this);
    }

    public String toString(){
        return "Start State.";
    }
}
