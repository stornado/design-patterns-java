package com.zxytech.designpatterns.gof.behavioralpatterns.observerpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
