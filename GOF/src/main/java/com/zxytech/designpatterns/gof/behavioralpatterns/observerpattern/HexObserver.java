package com.zxytech.designpatterns.gof.behavioralpatterns.observerpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()));
    }
}
