package com.zxytech.designpatterns.gof.behavioralpatterns.observerpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
