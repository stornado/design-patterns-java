package com.zxytech.designpatterns.gof.behavioralpatterns.statepattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
