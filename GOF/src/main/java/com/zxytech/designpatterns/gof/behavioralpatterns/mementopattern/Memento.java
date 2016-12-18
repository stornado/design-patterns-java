package com.zxytech.designpatterns.gof.behavioralpatterns.mementopattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
