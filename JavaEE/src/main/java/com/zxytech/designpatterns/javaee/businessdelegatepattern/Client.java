package com.zxytech.designpatterns.javaee.businessdelegatepattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class Client {
    BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public void doTask() {
        businessDelegate.doTask();
    }
}
