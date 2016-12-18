package com.zxytech.designpatterns.gof.behavioralpatterns.observerpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
